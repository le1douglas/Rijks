package le1.rijks.domain.business;

import io.reactivex.Observable;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;
import le1.rijks.data.JSONItemResponse.JSONItemResponse;
import le1.rijks.data.RijksClient;
import le1.rijks.domain.entities.WorkOfArt;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by leone on 14/01/18.
 */

public class Repo {
    private RijksClient client;

    public Repo() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://www.rijksmuseum.nl/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        client = retrofit.create(RijksClient.class);
    }

    public Observable<WorkOfArt> getWorkOfArt(String id) {
        return client.getArtObject(id)
                .map(new Function<JSONItemResponse, WorkOfArt>() {
                    @Override
                    public WorkOfArt apply(@NonNull JSONItemResponse jsonItemResponse) throws Exception {
                        return new WorkOfArt(jsonItemResponse);
                    }
                });
    }
}
