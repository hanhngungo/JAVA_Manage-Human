package model;

import java.util.ArrayList;
import java.util.Objects;

public class Province {
  private int proviceId;
  private String provinceName;
public Province(int proviceId, String provinceName) {
	this.proviceId = proviceId;
	this.provinceName = provinceName;
}
public int getProviceId() {
	return proviceId;
}
public void setProviceId(int proviceId) {
	this.proviceId = proviceId;
}
public String getProvinceName() {
	return provinceName;
}
public void setProvinceName(String provinceName) {
	this.provinceName = provinceName;
}
@Override
public String toString() {
	return "Province [proviceId=" + proviceId + ", provinceName=" + provinceName + "]";
}
@Override
public int hashCode() {
	return Objects.hash(proviceId, provinceName);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Province other = (Province) obj;
	return proviceId == other.proviceId && Objects.equals(provinceName, other.provinceName);
} 
public static ArrayList<Province> getListProvince(){
	String[] arr_province = {"An Giang",
						"Bà Rịa – Vũng Tàu",
						"Bạc Liêu",
						"Bắc Giang",
						"Bắc Kạn",
						"Bắc Ninh",
						"Bến Tre",
						"Bình Dương",
						"Bình Định",
						"Bình Phước",
						"Bình Thuận",
						"Cà Mau",
						"Cao Bằng",
						"Cần Thơ",
						"Đà Nẵng",
						"Đắk Lắk",
						"Đắk Nông",
						"Điện Biên",
						"Đồng Nai",
						"Đồng Tháp",
						"Gia Lai",
						"Hà Giang",
						"Hà Nam",
						"Hà Nội",
						"Hà Tĩnh",
						"Hải Dương",
						"Hải Phòng",
						"Hậu Giang",
						"Hòa Bình",
						"Thành phố Hồ Chí Minh",
						"Hưng Yên",
						"Khánh Hòa",
						"Kiên Giang",
						"Kon Tum",
						"Lai Châu",
						"Lạng Sơn",
						"Lào Cai",
						"Lâm Đồng",
						"Long An",
						"Nam Định",
						"Nghệ An",
						"Ninh Bình",
						"Ninh Thuận",
						"Phú Thọ",
						"Phú Yên",
						"Quảng Bình",
						"Quảng Nam",
						"Quảng Ngãi",
						"Quảng Ninh",
						"Quảng Trị",
						"Sóc Trăng",
						"Sơn La",
						"Tây Ninh",
						"Thái Bình",
						"Thái Nguyên",
						"Thanh Hóa",
						"Thừa Thiên Huế",
						"Tiền Giang",
						"Trà Vinh",
						"Tuyên Quang",
						"Vĩnh Long",
						"Vĩnh Phúc",
						"Yên Bái"};
	

	ArrayList<Province> listProvince = new ArrayList<Province>();
	int i = 0;
	for (String provincename :  arr_province) {
		Province p = new Province(i, provincename);
		listProvince.add(p);
	}
	return listProvince;
}

}
