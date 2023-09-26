package com.example.news360


import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import kotlinx.android.synthetic.main.activity_main2.*


class MainActivity2 : AppCompatActivity(), NewsItemClicked {


    private lateinit var mAdapter: NewsListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this)
        fetchData()
        val item = fetchData()
        mAdapter = NewsListAdapter(this)
        recyclerView.adapter = mAdapter

    }


    private fun fetchData() {


//        val cache = DiskBasedCache(cacheDir, 1024 * 1024) // 1MB cap
//        val network = BasicNetwork(HurlStack())
//        val requestQueue = RequestQueue(cache, network).apply {
//            start()
//        }


//        api-key = https://newsapi.org/v2/everything?q=apple&from=2022-08-05&to=2022-08-05&sortBy=popularity&apiKey=c22aed47c5b74cab83e8c8a2eb96a4b0


        val requestQueue: RequestQueue = Volley.newRequestQueue(this)

//        val url = "https://www.googleapis.com/blogger/v3/blogs/2399953/posts?key=AIzaSyCeaDf-mcoFzBF7yl4o0ROFj3zMs28VVjw"

//        val url =
//            "https://newsdata.io/api/1/news?apikey=pub_9963abeff3f3ab95ec66a90e408fc430f151&country=in&language=hi"





        val url1 = "https://newsdata.io/api/1/news?apikey=pub_9963abeff3f3ab95ec66a90e408fc430f151&country=in&language=en"

//        val url = "https://newsapi.org/v2/everything?q=bitcoin&apiKey=c22aed47c5b74cab83e8c8a2eb96a4b0"
//          val url = "http://api.mediastack.com/v1/news?access_key=058ccfc965407af30df4de6049f356a0"
        val jsonObjectRequest1 = JsonObjectRequest(
            Request.Method.GET,
            url1,
            null,
            {
                val newsJsonArray = it.getJSONArray("results")
                val newsArray = ArrayList<News>()
                for (i in 0 until newsJsonArray.length()) {
                    val newsJsonObject = newsJsonArray.getJSONObject(i)


                    // parsing news

                    val news = News(
                        newsJsonObject.getString("title"),
                        newsJsonObject.getString("creator"),
                        newsJsonObject.getString("description"),
                        newsJsonObject.getString("image_url")
                    )
                    newsArray.add(news)

                }
                mAdapter.updateNews(newsArray)
            },


            {

                // TODO: Handle error
                Toast.makeText(
                    this@MainActivity2.applicationContext,
                    "Something went wrong",
                    Toast.LENGTH_LONG
                ).show()
            }

        )


//        jsonObjectRequest.setShouldCache(false)
        requestQueue.cache.clear()
        requestQueue.add(jsonObjectRequest1)

        //Volley.newRequestQueue(this).add(jsonObjectRequest)
        //MySingleton.getInstance(this)?.addToRequestQueue(jsonObjectRequest)
        val url = "https://newsdata.io/api/1/news?apikey=pub_9963abeff3f3ab95ec66a90e408fc430f151&country=in&language=en"

//        val url = "https://newsapi.org/v2/everything?q=bitcoin&apiKey=c22aed47c5b74cab83e8c8a2eb96a4b0"
//          val url = "http://api.mediastack.com/v1/news?access_key=058ccfc965407af30df4de6049f356a0"
        val jsonObjectRequest = JsonObjectRequest(
            Request.Method.GET,
            url,
            null,
            {
                val newsJsonArray = it.getJSONArray("results")
                val newsArray = ArrayList<News>()
                for (i in 0 until newsJsonArray.length()) {
                    val newsJsonObject = newsJsonArray.getJSONObject(i)


                    // parsing news

                    val news = News(
                        newsJsonObject.getString("title"),
                        newsJsonObject.getString("creator"),
                        newsJsonObject.getString("description"),
                        newsJsonObject.getString("image_url")
                    )
                    newsArray.add(news)

                }
                mAdapter.updateNews(newsArray)
            },


            {

                // TODO: Handle error
                Toast.makeText(
                    this@MainActivity2.applicationContext,
                    "Something went wrong",
                    Toast.LENGTH_LONG
                ).show()
            }

        )


//        jsonObjectRequest.setShouldCache(false)
        requestQueue.cache.clear()
        requestQueue.add(jsonObjectRequest)

        //Volley.newRequestQueue(this).add(jsonObjectRequest)
        //MySingleton.getInstance(this)?.addToRequestQueue(jsonObjectRequest)








        eng2.setOnClickListener {
            val url = "https://newsdata.io/api/1/news?apikey=pub_9963abeff3f3ab95ec66a90e408fc430f151&country=in&language=en"

//        val url = "https://newsapi.org/v2/everything?q=bitcoin&apiKey=c22aed47c5b74cab83e8c8a2eb96a4b0"
//          val url = "http://api.mediastack.com/v1/news?access_key=058ccfc965407af30df4de6049f356a0"
            val jsonObjectRequest = JsonObjectRequest(
                Request.Method.GET,
                url,
                null,
                {
                    val newsJsonArray = it.getJSONArray("results")
                    val newsArray = ArrayList<News>()
                    for (i in 0 until newsJsonArray.length()) {
                        val newsJsonObject = newsJsonArray.getJSONObject(i)


                        // parsing news

                        val news = News(
                            newsJsonObject.getString("title"),
                            newsJsonObject.getString("creator"),
                            newsJsonObject.getString("description"),
                            newsJsonObject.getString("image_url")
                        )
                        newsArray.add(news)

                    }
                    mAdapter.updateNews(newsArray)
                },


                {

                    // TODO: Handle error
                    Toast.makeText(
                        this@MainActivity2.applicationContext,
                        "Something went wrong",
                        Toast.LENGTH_LONG
                    ).show()
                }

            )


//        jsonObjectRequest.setShouldCache(false)
            requestQueue.cache.clear()
            requestQueue.add(jsonObjectRequest)

            //Volley.newRequestQueue(this).add(jsonObjectRequest)
            //MySingleton.getInstance(this)?.addToRequestQueue(jsonObjectRequest)

        }





    hindi2.setOnClickListener {
        val url = "https://newsdata.io/api/1/news?apikey=pub_9963abeff3f3ab95ec66a90e408fc430f151&country=in&language=hi"

//        val url = "https://newsapi.org/v2/everything?q=bitcoin&apiKey=c22aed47c5b74cab83e8c8a2eb96a4b0"
//          val url = "http://api.mediastack.com/v1/news?access_key=058ccfc965407af30df4de6049f356a0"
        val jsonObjectRequest = JsonObjectRequest(
            Request.Method.GET,
            url,
            null,
            {
                val newsJsonArray = it.getJSONArray("results")
                val newsArray = ArrayList<News>()
                for (i in 0 until newsJsonArray.length()) {
                    val newsJsonObject = newsJsonArray.getJSONObject(i)


                    // parsing news

                    val news = News(
                        newsJsonObject.getString("title"),
                        newsJsonObject.getString("creator"),
                        newsJsonObject.getString("description"),
                        newsJsonObject.getString("image_url")
                    )
                    newsArray.add(news)

                }
                mAdapter.updateNews(newsArray)
            },


            {

                // TODO: Handle error
                Toast.makeText(
                    this@MainActivity2.applicationContext,
                    "Something went wrong",
                    Toast.LENGTH_LONG
                ).show()
            }

        )


//        jsonObjectRequest.setShouldCache(false)
        requestQueue.cache.clear()
        requestQueue.add(jsonObjectRequest)

        //Volley.newRequestQueue(this).add(jsonObjectRequest)
        //MySingleton.getInstance(this)?.addToRequestQueue(jsonObjectRequest)

    }
}












        override fun onItemClicked(item: News) {
        }

        override fun onBackPressed() {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }



}



