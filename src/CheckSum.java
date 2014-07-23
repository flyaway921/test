public class CheckSum {
	public static void main(String[] args) {
		// int a[8]={0x4E,0x00,0x00,0x7C,0x65,0x02,0x00,0x00};
		int a[] = { 0x4E, 0x00, 0x00, 0x20, 0x65, 0x00, 0x00, 0x00 };
		int b[] = new int[8], t;
		int i, sum = 0;
		int j = 0xD3;
		for (i = 0; i < 8; i++) {
			b[i] = a[i];
		}
		// b[7]=j;
		for (i = 0; i < 8; i++) {
			sum += a[i];
		}
		t = sum & 0xFF;
		t = ~t & 0xFF;
		b[1] = t;
		sum = 0;
		for (i = 0; i < 8; i++) {
			sum += b[i];
		}
		// printf("0x%X\n",~j&0xFF);
		System.out.println(sum & 0xFF);
	}
}
