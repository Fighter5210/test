package test0;

public class GenerateSql {

	public static void main(String[] args) {
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 16; j++) {
				System.out.println("ALTER TABLE hcv" + i + "cv_view_uv_" + j + " ADD INDEX createtime(createtime)");
			}
		}
		System.out.println("\n\n\n\n\n");
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 16; j++) {
				System.out.println("ALTER TABLE h_c_interact" + i + "userh_recvapp_" + j
						+ " ADD INDEX ur_filterflag(ur_filterflag)");
			}
		}
		String a = "1";
		String b = new String("1");
		System.out.println(a.equals(b));

	}

}
