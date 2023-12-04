package com.ifriend.data.networking.api.diary;

import com.ifriend.data.networking.responses.DiaryNoteDaoModel;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.exceptions.NotAuthorizedException;
import com.ifriend.domain.models.profile.user.User;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import retrofit2.Response;
/* compiled from: DiaryApiDelegate.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\t\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/ifriend/data/networking/api/diary/DiaryApiDelegate;", "", "api", "Lcom/ifriend/data/networking/api/diary/DiaryApi;", "userRepository", "Lcom/ifriend/domain/data/UserRepository;", "(Lcom/ifriend/data/networking/api/diary/DiaryApi;Lcom/ifriend/domain/data/UserRepository;)V", "getDiaryNote", "Lcom/ifriend/data/networking/responses/DiaryNoteDaoModel;", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDiaryNotes", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reply", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DiaryApiDelegate {
    private final DiaryApi api;
    private final UserRepository userRepository;

    @Inject
    public DiaryApiDelegate(DiaryApi api, UserRepository userRepository) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.api = api;
        this.userRepository = userRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getDiaryNotes(Continuation<? super List<DiaryNoteDaoModel>> continuation) {
        DiaryApiDelegate$getDiaryNotes$1 diaryApiDelegate$getDiaryNotes$1;
        int i;
        Response response;
        if (continuation instanceof DiaryApiDelegate$getDiaryNotes$1) {
            diaryApiDelegate$getDiaryNotes$1 = (DiaryApiDelegate$getDiaryNotes$1) continuation;
            if ((diaryApiDelegate$getDiaryNotes$1.label & Integer.MIN_VALUE) != 0) {
                diaryApiDelegate$getDiaryNotes$1.label -= Integer.MIN_VALUE;
                Object obj = diaryApiDelegate$getDiaryNotes$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = diaryApiDelegate$getDiaryNotes$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    User currentUser = this.userRepository.getCurrentUser();
                    if (currentUser == null) {
                        throw new NotAuthorizedException();
                    }
                    String formatted = currentUser.getAuth().getToken().formatted();
                    DiaryApi diaryApi = this.api;
                    String userIdValue = currentUser.getUserIdValue();
                    diaryApiDelegate$getDiaryNotes$1.label = 1;
                    obj = diaryApi.getAllNotes(formatted, userIdValue, diaryApiDelegate$getDiaryNotes$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                response = (Response) obj;
                if (response.isSuccessful()) {
                    throw new IllegalStateException("Failed to get diary notes");
                }
                List list = (List) response.body();
                return list == null ? CollectionsKt.emptyList() : list;
            }
        }
        diaryApiDelegate$getDiaryNotes$1 = new DiaryApiDelegate$getDiaryNotes$1(this, continuation);
        Object obj2 = diaryApiDelegate$getDiaryNotes$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = diaryApiDelegate$getDiaryNotes$1.label;
        if (i != 0) {
        }
        response = (Response) obj2;
        if (response.isSuccessful()) {
        }
    }

    public final Object reply(String str, Continuation<? super Response<ResponseBody>> continuation) {
        User currentUser = this.userRepository.getCurrentUser();
        if (currentUser == null) {
            throw new NotAuthorizedException();
        }
        return this.api.reply(currentUser.getAuth().getToken().formatted(), currentUser.getUserIdValue(), str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getDiaryNote(String str, Continuation<? super DiaryNoteDaoModel> continuation) {
        DiaryApiDelegate$getDiaryNote$1 diaryApiDelegate$getDiaryNote$1;
        int i;
        Response response;
        if (continuation instanceof DiaryApiDelegate$getDiaryNote$1) {
            diaryApiDelegate$getDiaryNote$1 = (DiaryApiDelegate$getDiaryNote$1) continuation;
            if ((diaryApiDelegate$getDiaryNote$1.label & Integer.MIN_VALUE) != 0) {
                diaryApiDelegate$getDiaryNote$1.label -= Integer.MIN_VALUE;
                Object obj = diaryApiDelegate$getDiaryNote$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = diaryApiDelegate$getDiaryNote$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    User currentUser = this.userRepository.getCurrentUser();
                    if (currentUser == null) {
                        throw new NotAuthorizedException();
                    }
                    String formatted = currentUser.getAuth().getToken().formatted();
                    DiaryApi diaryApi = this.api;
                    String userIdValue = currentUser.getUserIdValue();
                    diaryApiDelegate$getDiaryNote$1.label = 1;
                    obj = diaryApi.getNote(formatted, userIdValue, str, diaryApiDelegate$getDiaryNote$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                response = (Response) obj;
                if (response.isSuccessful()) {
                    throw new IllegalStateException("Failed to get diary notes");
                }
                DiaryNoteDaoModel diaryNoteDaoModel = (DiaryNoteDaoModel) response.body();
                if (diaryNoteDaoModel != null) {
                    return diaryNoteDaoModel;
                }
                throw new IllegalStateException("Failed to get diary notes");
            }
        }
        diaryApiDelegate$getDiaryNote$1 = new DiaryApiDelegate$getDiaryNote$1(this, continuation);
        Object obj2 = diaryApiDelegate$getDiaryNote$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = diaryApiDelegate$getDiaryNote$1.label;
        if (i != 0) {
        }
        response = (Response) obj2;
        if (response.isSuccessful()) {
        }
    }
}
