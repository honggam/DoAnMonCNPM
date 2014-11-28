package com.liferay.bean;
/***********************************************************************
 * Module:  Khoa.java
 * Author:  LENOVO
 * Purpose: Defines the Class Khoa
 ***********************************************************************/

import java.util.*;

/** @pdOid 91b807dc-6e62-4f95-bf22-1c1ba3fa51d4 */
public class Khoa {
   /** @pdOid 3b51f640-519a-4470-9708-3e464187ce16 */
   private long idKhoa;
   /** @pdOid 72a70a1d-0bbb-490f-9fd0-18a74e8d28bf */
   private String tenKhoa;
   
   /** @pdRoleInfo migr=no name=Lop assc=association10 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Aggregation */
   public java.util.Collection<Lop> lop;
   /** @pdRoleInfo migr=no name=User assc=association15 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection<User> user;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Lop> getLop() {
      if (lop == null)
         lop = new java.util.HashSet<Lop>();
      return lop;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorLop() {
      if (lop == null)
         lop = new java.util.HashSet<Lop>();
      return lop.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newLop */
   public void setLop(java.util.Collection<Lop> newLop) {
      removeAllLop();
      for (java.util.Iterator iter = newLop.iterator(); iter.hasNext();)
         addLop((Lop)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newLop */
   public void addLop(Lop newLop) {
      if (newLop == null)
         return;
      if (this.lop == null)
         this.lop = new java.util.HashSet<Lop>();
      if (!this.lop.contains(newLop))
         this.lop.add(newLop);
   }
   
   /** @pdGenerated default remove
     * @param oldLop */
   public void removeLop(Lop oldLop) {
      if (oldLop == null)
         return;
      if (this.lop != null)
         if (this.lop.contains(oldLop))
            this.lop.remove(oldLop);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllLop() {
      if (lop != null)
         lop.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<User> getUser() {
      if (user == null)
         user = new java.util.HashSet<User>();
      return user;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorUser() {
      if (user == null)
         user = new java.util.HashSet<User>();
      return user.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newUser */
   public void setUser(java.util.Collection<User> newUser) {
      removeAllUser();
      for (java.util.Iterator iter = newUser.iterator(); iter.hasNext();)
         addUser((User)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newUser */
   public void addUser(User newUser) {
      if (newUser == null)
         return;
      if (this.user == null)
         this.user = new java.util.HashSet<User>();
      if (!this.user.contains(newUser))
         this.user.add(newUser);
   }
   
   /** @pdGenerated default remove
     * @param oldUser */
   public void removeUser(User oldUser) {
      if (oldUser == null)
         return;
      if (this.user != null)
         if (this.user.contains(oldUser))
            this.user.remove(oldUser);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllUser() {
      if (user != null)
         user.clear();
   }

}