package com.liferay.bean;
/***********************************************************************
 * Module:  GiangVien.java
 * Author:  LENOVO
 * Purpose: Defines the Class GiangVien
 ***********************************************************************/

import java.util.*;

/** @pdOid 6d9cdeee-bdce-412b-bfb1-139afab390b1 */
public class GiangVien extends User {
   /** @pdOid 835eb3b5-d584-4bac-bae9-467c62ff3a1a */
   private long idGiangVien;
   /** @pdOid ca49029d-aa70-4323-ad22-cdbe4ff9331d */
   private String tenGiangVien;
   
   /** @pdRoleInfo migr=no name=Ctmh assc=association13 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Aggregation */
   public java.util.Collection<Ctmh> ctmh;
   /** @pdRoleInfo migr=no name=BaiViet assc=association16 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Aggregation */
   public java.util.Collection<BaiViet> baiViet;
   
   
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
   /** @pdGenerated default getter */
   public java.util.Collection<BaiViet> getBaiViet() {
      if (baiViet == null)
         baiViet = new java.util.HashSet<BaiViet>();
      return baiViet;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorBaiViet() {
      if (baiViet == null)
         baiViet = new java.util.HashSet<BaiViet>();
      return baiViet.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newBaiViet */
   public void setBaiViet(java.util.Collection<BaiViet> newBaiViet) {
      removeAllBaiViet();
      for (java.util.Iterator iter = newBaiViet.iterator(); iter.hasNext();)
         addBaiViet((BaiViet)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newBaiViet */
   public void addBaiViet(BaiViet newBaiViet) {
      if (newBaiViet == null)
         return;
      if (this.baiViet == null)
         this.baiViet = new java.util.HashSet<BaiViet>();
      if (!this.baiViet.contains(newBaiViet))
         this.baiViet.add(newBaiViet);
   }
   
   /** @pdGenerated default remove
     * @param oldBaiViet */
   public void removeBaiViet(BaiViet oldBaiViet) {
      if (oldBaiViet == null)
         return;
      if (this.baiViet != null)
         if (this.baiViet.contains(oldBaiViet))
            this.baiViet.remove(oldBaiViet);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllBaiViet() {
      if (baiViet != null)
         baiViet.clear();
   }

}