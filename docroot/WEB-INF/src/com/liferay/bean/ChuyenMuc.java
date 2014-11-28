package com.liferay.bean;
/***********************************************************************
 * Module:  ChuyenMuc.java
 * Author:  LENOVO
 * Purpose: Defines the Class ChuyenMuc
 ***********************************************************************/

import java.util.*;

/** @pdOid f0ed0b04-e506-4673-bdb4-829cf379241c */
public class ChuyenMuc {
   /** @pdOid 16b0b60f-8470-43f7-9c60-8c3efbac825b */
   private long idChuyenMuc;
   /** @pdOid 4af16b49-0dee-4896-8e16-0098c9e79fcf */
   private String tenChuyenMuc;
   
   /** @pdRoleInfo migr=no name=BaiViet assc=association12 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection<BaiViet> baiViet;
   
   
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