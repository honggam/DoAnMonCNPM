<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Liên Hệ</title>
</head>
<body>
<body>
<script type="text/javascript">
// JavaScript Document
    function validateForm() {
        //Há» ten pháº£i Ä‘Æ°á»£c Ä‘iá»n
        var hoTen = document.forms["myForm"]["hoten"].value;
        if (hoTen == "") {
            alert("Há» vÃ  TÃªn khÃ´ng Ä‘Æ°á»£c Ä‘á»ƒ trá»‘ng");
            return false;
        }
        //Email pháº£i Ä‘Æ°á»£c Ä‘iá»n chÃ­nh xÃ¡c
        var email=document.forms["myForm"]["email"].value;
        var aCong=email.indexOf("@");
        var dauCham = email.lastIndexOf(".");
        if (email != "") {
			 if ((aCong<1) || (dauCham<aCong+2) || (dauCham+2>email.length)) {
              alert("Email báº¡n Ä‘iá»n khÃ´ng chÃ­nh xÃ¡c");
              return false;
          }
        }
          //Nháº­p sá»‘ Ä‘iá»‡n thoáº¡i
          var dienThoai = document.forms["myForm"]["dienThoai"].value;
          var kiemTraDT = isNaN(dienThoai);
          if (dienThoai != "") {
              if (kiemTraDT == true) {
              alert("Äiá»‡n thoáº¡i pháº£i Ä‘á»ƒ á»Ÿ Ä‘á»‹nh dáº¡ng sá»‘");
              return false;
          }
          }
         
          //chá»§ Ä‘á» pháº£i Ä‘Æ°á»£c Ä‘iá»n
		    var chuDe = document.forms["myForm"]["chuDe"].value;
        if (chuDe == "") {
            alert("Chá»§ Ä‘á» khÃ´ng Ä‘Æ°á»£c Ä‘á»ƒ trá»‘ng");
            return false;
        }
 		//ná»™i dung Ã½ kiáº¿n pháº£i Ä‘Æ°á»£c Ä‘iá»n
			   var yKien = document.forms["myForm"]["yKien"].value;
        if (yKien == "") {
            alert("Ná»™i dung khÃ´ng Ä‘Æ°á»£c Ä‘á»ƒ trá»‘ng");
            return false;
        }
}
</script>

<br />
<h1></h1>

<form action="#" method="post" name="myForm" onsubmit="return validateForm()">
<table bgcolor="#DDDDDD" id="formdangky" style="width: 100%;">
<tbody>
<tr>
    <td class="tenhang" width="118">Họ Và Tên: (*)</td>
    <td width="320"><input name="hoten" type="text" /></td>
  </tr>
<tr>
    <td class="tenhang">Email:</td>
    <td><input name="email" type="text" /></td>
  </tr>
<tr>
    <td class="tenhang">Số Điện Thoại:</td>
    <td><input maxlength="11/" name="dienThoai" type="text" /></td>
  </tr>
<tr>
    <td class="tenhang">Chủ Đề: (*)</td>
    <td> <input name="chuDe" type="text" />
</td>
  </tr>
<tr>
    <td class="tenhang">Nội dung ý kiến: (*)</td>
    <td><textarea name="yKien" rows="2" cols="20" style="height:150px;width:400px;"></textarea>
    </td>
  </tr>
<tr>
	  <td class="tenhang"></td>
    <td>(*): Thông báo</br><input name="Submit" type="submit" value="Gửi thông tin" align="middle"/></td>

  </tr>
</tbody></table>
</form>

</body>
</html>