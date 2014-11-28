package com.liferay.bean;
/***********************************************************************
 * Module:  Lop.java
 * Author:  LENOVO
 * Purpose: Defines the Class Lop
 ***********************************************************************/

import java.util.*;

/** @pdOid 52743bb5-761a-4f7a-b466-8340d76868c6 */
public class Lop {
   /** @pdOid da099880-ec8a-452b-9e1a-81b91cc23023 */
   private long idLop;
   /** @pdOid a41364a9-b6b9-40f2-abe5-7d3434f67b9d */
   private String tenLop;
   /** @pdOid ce25fbf8-a2dc-486f-b420-409cdcc8b4ef */
   private long idKhoa;
   
   /** @pdRoleInfo migr=no name=SinhVien assc=association11 coll=java.util.Collection impl=java.util.HashSet mult=1..* type=Composition */
   public java.util.Collection<SinhVien> sinhVien;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<SinhVien> getSinhVien() {
      if (sinhVien == null)
         sinhVien = new java.util.HashSet<SinhVien>();
      return sinhVien;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorSinhVien() {
      if (sinhVien == null)
         sinhVien = new java.util.HashSet<SinhVien>();
      return sinhVien.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newSinhVien */
   public void setSinhVien(java.util.Collection<SinhVien> newSinhVien) {
      removeAllSinhVien();
      for (java.util.Iterator iter = newSinhVien.iterator(); iter.hasNext();)
         addSinhVien((SinhVien)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newSinhVien */
   public void addSinhVien(SinhVien newSinhVien) {
      if (newSinhVien == null)
         return;
      if (this.sinhVien == null)
         this.sinhVien = new java.util.HashSet<SinhVien>();
      if (!this.sinhVien.contains(newSinhVien))
         this.sinhVien.add(newSinhVien);
   }
   
   /** @pdGenerated default remove
     * @param oldSinhVien */
   public void removeSinhVien(SinhVien oldSinhVien) {
      if (oldSinhVien == null)
         return;
      if (this.sinhVien != null)
         if (this.sinhVien.contains(oldSinhVien))
            this.sinhVien.remove(oldSinhVien);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllSinhVien() {
      if (sinhVien != null)
         sinhVien.clear();
   }

}