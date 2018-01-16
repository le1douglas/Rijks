package le1.rijks.data;

import io.reactivex.Observable;
import le1.rijks.data.JSONItemResponse.JSONItemResponse;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RijksClient {

   /* @GET("nl/collection?key=22sjyHcm&format=json&type=schilderij")
    Call<RijksSearchResponse> searchArtObject();*/

    @GET("en/collection/{number}?key=22sjyHcm&format=json")
    Observable<JSONItemResponse> getArtObject(@Path("number") String number);

}
