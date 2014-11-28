package com.liferay.bean;
/***********************************************************************
 * Module:  MonHoc.java
 * Author:  LENOVO
 * Purpose: Defines the Class MonHoc
 ***********************************************************************/

import java.util.*;

/** @pdOid 8f35be8b-6f8b-4639-afd6-7c40375d671b */
public class MonHoc {
   /** @pdOid 0e6a3c6d-f666-441f-8a52-63a384ab42cd */
   private long idMonHoc;
   /** @pdOid 9b389f03-7fbd-4562-8a9b-d531b412b677 */
   private int soTinChi;
   /** @pdOid 8e8539e3-ee00-4708-a756-bad28d8273b7 */
   private String tenMonHoc;
   
   /** @pdRoleInfo migr=no name=Ctmh assc=association7 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
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