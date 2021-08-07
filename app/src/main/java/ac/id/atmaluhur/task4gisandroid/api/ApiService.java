package ac.id.atmaluhur.task4gisandroid.api;

import ac.id.atmaluhur.task4gisandroid.model.ListLocationModel;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("JsonDisplayMarker.php")
    Call<ListLocationModel> getAllLocation();
}
