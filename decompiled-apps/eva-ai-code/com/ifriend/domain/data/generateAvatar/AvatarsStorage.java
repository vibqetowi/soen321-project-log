package com.ifriend.domain.data.generateAvatar;

import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.apache.http.cookie.ClientCookie;
/* compiled from: AvatarsStorage.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0006\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J#\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH¦@ø\u0001\u0000¢\u0006\u0002\u0010\rJ#\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH¦@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u001b\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u001b\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\nH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J)\u0010\u0012\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J!\u0010\u0016\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/ifriend/domain/data/generateAvatar/AvatarsStorage;", "", "clear", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllGeneratedAvatars", "deleteUserAvatar", "getGeneratedAvatar", "", "format", "Lcom/ifriend/domain/data/generateAvatar/FileFormat;", "name", "", "(Lcom/ifriend/domain/data/generateAvatar/FileFormat;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGeneratedAvatarUri", "getUserAvatar", "(Lcom/ifriend/domain/data/generateAvatar/FileFormat;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserAvatarUri", "saveGeneratedAvatar", "inputStream", "Ljava/io/InputStream;", "(Lcom/ifriend/domain/data/generateAvatar/FileFormat;Ljava/lang/String;Ljava/io/InputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveUserAvatar", "(Lcom/ifriend/domain/data/generateAvatar/FileFormat;Ljava/io/InputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUserAvatarByGenerated", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AvatarsStorage {
    Object clear(Continuation<? super Unit> continuation);

    Object deleteAllGeneratedAvatars(Continuation<? super Unit> continuation);

    Object deleteUserAvatar(Continuation<? super Unit> continuation);

    Object getGeneratedAvatar(FileFormat fileFormat, String str, Continuation<? super byte[]> continuation);

    Object getGeneratedAvatarUri(FileFormat fileFormat, String str, Continuation<? super String> continuation);

    Object getUserAvatar(FileFormat fileFormat, Continuation<? super byte[]> continuation);

    Object getUserAvatarUri(FileFormat fileFormat, Continuation<? super String> continuation);

    Object saveGeneratedAvatar(FileFormat fileFormat, String str, InputStream inputStream, Continuation<? super String> continuation);

    Object saveUserAvatar(FileFormat fileFormat, InputStream inputStream, Continuation<? super String> continuation);

    Object updateUserAvatarByGenerated(String str, Continuation<? super Unit> continuation);
}
