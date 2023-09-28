package com.kotlin.recyclerfragments

object Constants {
    //Array list and return the ArrayList
    fun getEmployeeData():ArrayList<contact_model>{
        //create an array list of type employee class
        val employeeList = ArrayList<contact_model>()
        val emp1 = contact_model("Kirabo G H", "g.kirabo.h@gmail.com")
        employeeList.add(emp1)
        val emp2 = contact_model("Kirabo G H", "g.kirabo.h@gmail.com")
        employeeList.add(emp2)
        val emp3 = contact_model("Kirabo G H", "g.kirabo.h@gmail.com")
        employeeList.add(emp3)
        val emp4 = contact_model("Kirabo G H", "g.kirabo.h@gmail.com")
        employeeList.add(emp4)
        val emp5 = contact_model("Kirabo G H", "g.kirabo.h@gmail.com")
        employeeList.add(emp5)
        return employeeList
    }
}