package com.example.Coronatracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)







            val cases = ArrayList<Recent_cases_data>()

            cases.add(Recent_cases_data(1 ,"Andhra Pradesh" ,08662410978))
            cases.add(Recent_cases_data(2 ,"Arunachal Pradesh" ,9436055743))
            cases.add(Recent_cases_data(3 ,"Assam"  ,6913347770))
            cases.add(Recent_cases_data(4 ,"Bihar" ,104))
            cases.add(Recent_cases_data(5 ,"Chhattisgarh" ,104))
            cases.add(Recent_cases_data(6 ,"Goa" ,104))
            cases.add(Recent_cases_data(7 ,"Gujarat" ,104))
            cases.add(Recent_cases_data(8 ,"Haryana" ,8558893911 ))
            cases.add(Recent_cases_data(9 ,"Himachal Pradesh" ,104 ))
            cases.add(Recent_cases_data(10 ,"Jharkhand" ,104 ))
            cases.add(Recent_cases_data(11 ,"Karnataka" ,104))
            cases.add(Recent_cases_data(12 ,"Kerala" ,0471-2552056))
            cases.add(Recent_cases_data(13 ,"Madhya Pradesh", 104 ))
            cases.add(Recent_cases_data(14 ,"Maharashtra" ,020-26127394 ))
            cases.add(Recent_cases_data(15 ,"Manipur" ,3852411668))
            cases.add(Recent_cases_data(16 ,"Meghalaya" ,108 ))
            cases.add(Recent_cases_data(17 ,"Mizoram" ,102 ))
            cases.add(Recent_cases_data(18 ,"Nagaland" ,7005539653 ))
            cases.add(Recent_cases_data(19 ,"Odisha" ,9439994859 ))
            cases.add(Recent_cases_data(20 ,"Punjab" ,104))
            cases.add(Recent_cases_data(21 ,"Rajasthan" ,0141-2225624))
            cases.add(Recent_cases_data(22 ,"Sikkim" ,104 ))
            cases.add(Recent_cases_data(23 ,"Tamil Nadu" ,044-29510500))
            cases.add(Recent_cases_data(24 ,"Telangana" ,104))
            cases.add(Recent_cases_data(25 ,"Tripura" ,0381-2315879))
            cases.add(Recent_cases_data(26 ,"Uttarakhand" ,104 ))
            cases.add(Recent_cases_data(27 ,"Uttar Pradesh" ,18001805145))
            cases.add(Recent_cases_data(28 ,"West Bengal" ,1800313444222,03323412600))
            cases.add(Recent_cases_data(29 ,"Andaman and Nicobar Islands" ,03192-232102 ))
            cases.add(Recent_cases_data(30 ,"Chandigarh" ,9779558282))
            cases.add(Recent_cases_data(31 ,"Dadra and Nagar Haveli and Daman & Diu" ,104))
            cases.add(Recent_cases_data(32 ,"Delhi" ,011-22307145))
            cases.add(Recent_cases_data(33 ,"Jammu & Kashmir" ,01912520982,0194-2440283 ))
            cases.add(Recent_cases_data(34 ,"Ladakh" ,01982256462))
            cases.add(Recent_cases_data(35 ,"Lakshadweep" ,104))
            cases.add(Recent_cases_data(36 ,"Puducherry" ,104))




            val adapter = Recent_cases_adapter(cases)


        }


}


