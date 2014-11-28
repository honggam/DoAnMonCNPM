package com.liferay.bean;
/***********************************************************************
 * Module:  Phong.java
 * Author:  LENOVO
 * Purpose: Defines the Class Phong
 ***********************************************************************/

import java.util.*;

/** @pdOid 0d0fece6-df6c-4d9d-ba03-746391ae8d7a */
public class Phong {
   /** @pdOid 46a82a2a-d70f-4968-a15c-926b28427529 */
   private long idPhong;
   /** @pdOid 626f2156-4e31-4798-a914-c3df43d44319 */
   private String tenPhong;
   /** @pdOid 3e24b89b-e889-4b93-9122-db536b2deb66 */
   private String tenGiangDuong;
   
   /** @pdRoleInfo migr=no name=Ctmh assc=association9 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
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