package com.liferay.controller;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.ProcessAction;

import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class XemDiemController
 */
public class XemDiemController extends MVCPortlet {
 
	@ProcessAction(name="inputMSSVAction")
	public void inputMSSV(ActionRequest actionRequest, ActionResponse actionResponse){
		String mssv = actionRequest.getParameter("idMaSinhVien");
		String url ="";
		
		if(mssv.equals("11130058")){
			url = "hienthidiemcontroller/view.jsp";
		}
		else{
			System.out.println("Mã số sinh viên không tồn tại");
		}
		actionRequest.setAttribute(" " , mssv);
		actionRequest.setAttribute("", url);
	}

}
