package com.ifriend.data.networking.api.diary;

import com.ifriend.data.networking.responses.DiaryNoteDaoModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
/* compiled from: DiaryApi.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J1\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0007H§@ø\u0001\u0000¢\u0006\u0002\u0010\tJ5\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u0007H§@ø\u0001\u0000¢\u0006\u0002\u0010\fJ5\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u0007H§@ø\u0001\u0000¢\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/ifriend/data/networking/api/diary/DiaryApi;", "", "getAllNotes", "Lretrofit2/Response;", "", "Lcom/ifriend/data/networking/responses/DiaryNoteDaoModel;", "auth", "", "userId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNote", "diaryId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reply", "Lokhttp3/ResponseBody;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface DiaryApi {
    @GET("/ai/users/{user-id}/diary-notes")
    Object getAllNotes(@Header("Authorization") String str, @Path("user-id") String str2, Continuation<? super Response<List<DiaryNoteDaoModel>>> continuation);

    @GET("/ai/users/{user-id}/diary-note/{diary-id}")
    Object getNote(@Header("Authorization") String str, @Path("user-id") String str2, @Path("diary-id") String str3, Continuation<? super Response<DiaryNoteDaoModel>> continuation);

    @POST("/ai/users/{user-id}/diary-note/{diary-id}/reply")
    Object reply(@Header("Authorization") String str, @Path("user-id") String str2, @Path("diary-id") String str3, Continuation<? super Response<ResponseBody>> continuation);
}
