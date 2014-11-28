package com.liferay.bean;
/***********************************************************************
 * Module:  SinhVien.java
 * Author:  LENOVO
 * Purpose: Defines the Class SinhVien
 ***********************************************************************/

import java.util.*;

/** @pdOid 51a417ac-480a-47db-9028-f4fbf0f8db62 */
public class SinhVien extends User {
   /** @pdOid a59a70c3-5a26-43f3-b8b0-992aad2a004c */
   private long idSinhVien;
   /** @pdOid 3585dd40-5775-4d8b-b9ce-79f0b0fac555 */
   private String tenSinhVien;
   /** @pdOid af095bab-6e2f-480a-a1bb-62f6c257c34e */
   private long idLop;
   
   /** @pdRoleInfo migr=no name=Ctmh assc=association14 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Aggregation */
   public java.util.Collection<Ctmh> ctmh;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Ctmh> getCtmh() {
      if (ctmh == null)
         ctmh = new java.util.HashSet<Ctmh>();
      return ctmh;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorCtmh() {
      if (ctmh == null)
         ctmh = new java.util.HashSet<Ctmh>();
      return ctmh.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newCtmh */
   public void setCtmh(java.util.Collection<Ctmh> newCtmh) {
      removeAllCtmh();
      for (java.util.Iterator iter = newCtmh.iterator(); iter.hasNext();)
         addCtmh((Ctmh)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newCtmh */
   public void addCtmh(Ctmh newCtmh) {
      if (newCtmh == null)
         return;
      if (this.ctmh == null)
         this.ctmh = new java.util.HashSet<Ctmh>();
      if (!this.ctmh.contains(newCtmh))
         this.ctmh.add(newCtmh);
   }
   
   /** @pdGenerated default remove
     * @param oldCtmh */
   public void removeCtmh(Ctmh oldCtmh) {
      if (oldCtmh == null)
         return;
      if (this.ctmh != null)
         if (this.ctmh.contains(oldCtmh))
            this.ctmh.remove(oldCtmh);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllCtmh() {
      if (ctmh != null)
         ctmh.clear();
   }

}