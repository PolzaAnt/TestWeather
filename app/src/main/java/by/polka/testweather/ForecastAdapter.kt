//package by.polka.testweather
//
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//import kotlinx.android.synthetic.main.weather_item.view.*
//import java.util.ArrayList
//
//class ForecastAdapter:RecyclerView.Adapter<ForecastAdapter.ForecastViewHolder>(){
//    private var listForecast = ArrayList<Forecast>()
//
//    class ForecastViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//
//        fun bind(forecast: Forecast) {
//            itemView.apply {
//                status.text = forecast.status
//                temp.text = forecast.temp.toString()
//            }
//        }
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ForecastViewHolder {
//        val view = LayoutInflater.from(parent.context).inflate(R.layout.weather_item, parent, false)
//        return ForecastViewHolder(view)
//    }
//
//    override fun getItemCount() = listForecast.size
//
//    override fun onBindViewHolder(holder: ForecastViewHolder, position: Int) {
//        holder.bind(listForecast[position])
//    }
//
//}