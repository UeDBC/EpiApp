package utils;

import android.content.Context;
import android.os.AsyncTask;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by agus on 11/05/15.
 */
public class APICaller {

    private Context context;


    public APICaller(Context context){
        this.context = context;
    }

    public class HttpGetTask extends AsyncTask<String, Void, String> {
        String result = "fail";
        OnWebServiceResponseListener listener;

        HttpGetTask (OnWebServiceResponseListener listener){
            this.listener = listener;
        }

        @Override
        protected String doInBackground(String... params) {
            // TODO Auto-generated method stub
            return getResult(params[0]);
        }

        final String getResult(String url)
        {
            BufferedReader inStream = null;
            try {
                HttpClient httpClient = new DefaultHttpClient();
                HttpGet httpRequest = new HttpGet(url);
                HttpResponse response = httpClient.execute(httpRequest);
                inStream = new BufferedReader(
                        new InputStreamReader(
                                response.getEntity().getContent()));

                StringBuffer buffer = new StringBuffer("");
                String line = "";
                String NL = System.getProperty("line.separator");
                while ((line = inStream.readLine()) != null) {
                    buffer.append(line + NL);
                }
                inStream.close();

                result = buffer.toString();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } finally {
                if (inStream != null) {
                    try {
                        inStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            return result;
        }

        protected void onPostExecute(String page)
        {
            try {
                JSONObject jsonObject = new JSONObject(page);
                listener.onWebServiceResponse(jsonObject);
            } catch (JSONException e){

            }
        }
    }



}
