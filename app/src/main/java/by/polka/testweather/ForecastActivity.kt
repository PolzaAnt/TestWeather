//package by.polka.testweather
//
//import android.os.AsyncTask
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.view.View
//import android.widget.TextView
//import androidx.recyclerview.widget.LinearLayoutManager
//import androidx.recyclerview.widget.RecyclerView
//import org.json.JSONObject
//import java.net.URL
//import java.util.*
//
//class ForecastActivity : AppCompatActivity() {
//    val API: String = "64273b7222c3daf0b04b7827f23239d4"
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_forecast)
//        val forecastAdapter = ForecastAdapter()
//        val recycler = findViewById<RecyclerView>(R.id.recycler_weather)
//        recycler.apply {
//            adapter=forecastAdapter
//            layoutManager=LinearLayoutManager(this@ForecastActivity)
//        }
//        weatherTask().execute()
//    }
//
//    inner class weatherTask() : AsyncTask<String, Void, String>() {
//        override fun onPreExecute() {
//            super.onPreExecute()
//            findViewById<TextView>(R.id.errorText).visibility = View.GONE
//        }
//
//        override fun doInBackground(vararg params: String?): String? {
//            var response:String?
//            try{
//                response = URL("https://api.openweathermap.org/data/2.5/forecast?cnt=40&lat=53.9&lon=27.5667&units=metric&appid=$API").readText(
//                    Charsets.UTF_8
//                )
//            }catch (e: Exception){
//                response = null
//            }
//            return response
//        }
//
//        override fun onPostExecute(result: String?) {
//            super.onPostExecute(result)
//            try {
//                val jsonObj = JSONObject(result)
//                val main = jsonObj.getJSONObject("main")
//                val weather = jsonObj.getJSONArray("weather").getJSONObject(0)
//
//
//                val temp = main.getString("temp")+"°C"
//                val weatherDescription = weather.getString("description")
//
//                findViewById<TextView>(R.id.status).text = weatherDescription.capitalize()
//                findViewById<TextView>(R.id.temp).text = temp
//
//
//            } catch (e: Exception) {
//                findViewById<TextView>(R.id.errorText).visibility = View.VISIBLE
//            }
//
//        }
//    }
//
//}