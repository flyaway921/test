package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * 反射操作类
 */
public class GetMyInfo {

	public static void main(String[] args) throws ClassNotFoundException,
			SecurityException, NoSuchMethodException, InstantiationException,
			IllegalAccessException, IllegalArgumentException,
			InvocationTargetException {

		Class mclass = Class.forName("reflect.UserInfo");
		System.out.println("------------输出类名-----------------------");
		System.out.println(mclass.getName());
		System.out.println(mclass.getSimpleName()); // 基础类的简称

		// 获取属性(字段)
		System.out.println("------------输出所有属性--------------------");
		Field[] fileds = mclass.getDeclaredFields(); // 得到所声明的所有的字段，包括公共，保护，默认（包）和私有变量，但不包括继承的字段。
		// Field[] fileds = mclass.getFields(); //得到所声明的所有可访问的公共字段。
		for (Field field : fileds) {
			String fieldName = field.getName(); // 属性名称
			int fieldFangWen = field.getModifiers(); // 属性访问权限修饰符
			Class fieldType = field.getType(); // 属性类型
			System.out.println(Modifier.toString(fieldFangWen) + " "
					+ fieldType.getSimpleName() + " " + fieldName);
		}

		// 获取方法
		System.out.println("------------输出所有方法--------------------");
		Method[] methods = mclass.getDeclaredMethods();
		// Method[] medthods = mclass.getMethods();
		for (Method method : methods) {
			String methodName = method.getName(); // 方法名称
			int methodFangWen = method.getModifiers(); // 访问修饰符
			Class methodRetrunType = method.getReturnType();// 返回类型
			Class[] methodParameter = method.getParameterTypes();// 方法的参数列表
			System.out
					.print(Modifier.toString(methodFangWen) + " "
							+ methodRetrunType.getSimpleName() + " "
							+ methodName + "(");
			for (int k = 0; k < methodParameter.length; k++) {
				String parameterName = methodParameter[k].getSimpleName();
				if (k != methodParameter.length - 1) {
					System.out.print(parameterName + " arg" + k + ",");
				} else
					System.out.print(parameterName + " arg" + k);
			}
			System.out.println(");");

		}

		// 获取构造
		System.out.println("------------输出所有构造器--------------------");
		Constructor[] constructors = mclass.getConstructors();
		for (Constructor constructor : constructors) {
			String constructorName = constructor.getName();
			Class[] constructorParameter = constructor.getParameterTypes();
			System.out.print(mclass.getSimpleName()
					+ " "
					+ constructorName.substring(
							constructorName.lastIndexOf(".") + 1,
							constructorName.length()) + "(");
			for (int h = 0; h < constructorParameter.length; h++) {
				String parameterName = constructorParameter[h].getSimpleName();
				if (h != constructorParameter.length - 1)
					System.out.print(parameterName + " arg" + h + ",");
				else
					System.out.print(parameterName + " arg" + h);
			}
			System.out.println(");");

		}

		// 如何执行指定的方法
		System.out.println("------------反射执行方法--------------------");
		String name = "getMyInfo";
		Class[] parameterTypes = new Class[3];
		parameterTypes[0] = String.class;
		parameterTypes[1] = String.class;
		parameterTypes[2] = Integer.class;

		Method me = mclass.getDeclaredMethod(name, parameterTypes);
		Object obj = mclass.newInstance();
		Object[] arg = new Object[3];
		arg[0] = "范晶晶";
		arg[1] = "AAA风景区";
		arg[2] = new Integer(18);
		me.invoke(obj, arg);
		
//		can not access a member of class reflect.UserInfo with modifiers "private" without setAccessible(true)
		Method me2 = mclass.getDeclaredMethod("testPrivateMethod", null);
		me2.setAccessible(true);
		me2.invoke(obj, null);
	}

}
