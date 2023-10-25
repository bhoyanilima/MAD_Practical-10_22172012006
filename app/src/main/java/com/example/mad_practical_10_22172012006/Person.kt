package com.example.mad_practical_10_22172012006

import org.json.JSONObject
import java.io.Serializable

class Person (var id:String,var name:String,var emailId:String,var phoneNo:String,var address:String,var latitude:Double,var logintube:Double):Serializable
{
    /*
      * [
      * {"_id":"5f8d677c68d8ae7ceab6a732",
      * "name":{"first":"Lloyd","last":"York"},
      * "email":"lloyd.york@undefined.net",
      * "phone":"+1 (817) 545-3660",
      * "address":"311 Livonia Avenue, Belva, Ohio, 6019"}*/
    constructor(jsonObject: JSONObject):this("","","","","",0.0,0.0) {
        id = jsonObject.getString("id")
        emailId = jsonObject.getString("email")
        phoneNo = jsonObject.getString("phone")
        val profileJson = jsonObject.getJSONObject("profile")
        name = profileJson.getString("name")
        address = profileJson.getString("address")
        val locationJson = profileJson.getJSONObject("location")
        latitude = locationJson.getDouble("lat")
        logintube = locationJson.getDouble("long")
    }
}