<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="content-type" content="text/html" ; charset="utf-8" />
<title>Hiển Thị Điểm</title>
</head>
<body>
	<form method="post" action="XemDiemThi">
		<div class="center">
			<table cellpadding="0" cellspacing="1">
				<tbody>
					<tr>
						<td style="text-align: left; width: 150px"><span
							id="ThongTinSV_MaSinhVien" class="Lable">Mã sinh viên</span></td>
						<td class="Left" style="text-align: left"><span
							id="ThongTinSV_lblMaSinhVien" class="Lable"
							style="font-weight: bold;">11130058</span></td>
					</tr>
					<tr>
						<td style="text-align: left"><span
							id="ThongTinSV_TenSinhVien" class="Label">Tên Sinh Viên</span></td>
						<td style="text-align: left"><span
							id="ThongTinSV_lblTenSinhVien" class="Lablel"
							style="font-weight: bold;">Võ Thị Hồng Gấm</span></td>
					</tr>
					<tr>
						<td style="text-align: left"><span id="ThongTinSV_Lop"
							class="Label">Lớp</span></td>
						<td style="text-align: left"><span id="ThongTinSV_lblLop"
							class="Label">DH11DT</span></td>
					</tr>
					<tr>
						<td style="text-align: left"><span id="ThongTinSV_Khoa"
							class="Label">Khoa</span></td>
						<td style="text-align: left"><span id="ThongTinSV_lblKhoa"
							class="Label">Công nghệ thông tin</span></td>
					</tr>
				</tbody>
			</table>
		</div>
	</form>

	<table border="1px" cellpadding="20px" >
		<tr class="title-diem" style="border-color: blue;" background="Blue">
			<td title="Số thứ tự" align="center" style="width: 16px;">STT</td>

			<td title="Mã môn học" align="center" style="width: 60px;">Mã
				Môn</td>

			<td title="Tên môn học" align="" style="width: 250px;">Tên Môn</td>

			<td title="Số tín chỉ" align="left" style="width: 20px;">TC</td>


			<td title="Điểm thi" align="center" style="width: 20px;">Điểm
				Thi</td>
		</tr>

		<tr>
			<td align="left" style="width: 16px;">1</td>

			<td align="center" style="width: 60px;">214371</td>

			<td align="left" style="width: 2500px;">Nhập môn CNPM</td>

			<td align="center" style="width: 20px;">3</td>

			<td align="center" style="width: 60px;">&nbsp;</td>
		</tr>

		<tr>
			<td align="left" style="width: 16px;">2</td>

			<td align="center" style="width: 60px;">214354</td>

			<td align="left" style="width: 2500px;">Lập Trình Mạng</td>

			<td align="center" style="width: 20px;">4</td>

			<td align="center" style="width: 60px;">&nbsp;</td>
		</tr>

	</table>
</body>
</html>