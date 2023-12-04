package com.ifriend.data.storages.avatar;

import android.content.Context;
import android.net.Uri;
import com.facebook.share.internal.ShareInternalUtility;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.AuthDataProvider;
import com.ifriend.domain.data.generateAvatar.AvatarsStorage;
import com.ifriend.domain.data.generateAvatar.FileFormat;
import com.ifriend.domain.models.profile.user.AuthData;
import com.ifriend.domain.models.profile.user.UserId;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import okhttp3.internal.http2.StreamResetException;
import org.apache.http.client.config.CookieSpecs;
/* compiled from: AvatarsStorage.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 52\u00020\u0001:\u000256B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0011\u0010\u0011\u001a\u00020\u0012H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J\u0011\u0010\u0014\u001a\u00020\u0012H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J\u0011\u0010\u0018\u001a\u00020\u0012H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J+\u0010\u0019\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010 J\u0011\u0010!\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J#\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010$J#\u0010%\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010$J\u001b\u0010&\u001a\u0004\u0018\u00010#2\u0006\u0010\u001a\u001a\u00020\u001bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010'J\u001b\u0010(\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001a\u001a\u00020\u001bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010'J\u0019\u0010)\u001a\u00020#2\u0006\u0010\u0016\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J!\u0010*\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010+\u001a\u00020,H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010-J)\u0010.\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020,H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010/J!\u00100\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020,H\u0096@ø\u0001\u0000¢\u0006\u0002\u00101J\u0019\u00102\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001dH\u0096@ø\u0001\u0000¢\u0006\u0002\u00103J\f\u00104\u001a\u00020\u0012*\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u00020\n8BX\u0082\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u00020\n8BX\u0082\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u000f\u001a\u00020\n8BX\u0082\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u00067"}, d2 = {"Lcom/ifriend/data/storages/avatar/AvatarsStorageImpl;", "Lcom/ifriend/domain/data/generateAvatar/AvatarsStorage;", "authDataProvider", "Lcom/ifriend/domain/data/AuthDataProvider;", "context", "Landroid/content/Context;", "dispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "(Lcom/ifriend/domain/data/AuthDataProvider;Landroid/content/Context;Lcom/ifriend/domain/CoroutineDispatchers;)V", "avatarDir", "Ljava/io/File;", "getAvatarDir", "()Ljava/io/File;", "generatedAvatarDir", "getGeneratedAvatarDir", "userAvatarDir", "getUserAvatarDir", "clear", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllGeneratedAvatars", "deleteFile", ShareInternalUtility.STAGING_PARAM, "(Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteUserAvatar", "getAvatarFile", "format", "Lcom/ifriend/domain/data/generateAvatar/FileFormat;", "name", "", "isUser", "", "(Lcom/ifriend/domain/data/generateAvatar/FileFormat;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrentUserDir", "getGeneratedAvatar", "", "(Lcom/ifriend/domain/data/generateAvatar/FileFormat;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGeneratedAvatarUri", "getUserAvatar", "(Lcom/ifriend/domain/data/generateAvatar/FileFormat;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserAvatarUri", "readFile", "saveFile", "inputStream", "Ljava/io/InputStream;", "(Ljava/io/File;Ljava/io/InputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveGeneratedAvatar", "(Lcom/ifriend/domain/data/generateAvatar/FileFormat;Ljava/lang/String;Ljava/io/InputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveUserAvatar", "(Lcom/ifriend/domain/data/generateAvatar/FileFormat;Ljava/io/InputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUserAvatarByGenerated", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteDirectory", "Companion", "FailedToSaveAvatarException", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AvatarsStorageImpl implements AvatarsStorage {
    private static final String AVATARS_DIR = "Avatars";
    public static final Companion Companion = new Companion(null);
    private static final String GENERATED_AVATARS_DIR = "Generated";
    private static final String USER_AVATAR = "UserAvatar";
    private static final String USER_AVATARS_DIR = "User";
    private final AuthDataProvider authDataProvider;
    private final File avatarDir;
    private final CoroutineDispatchers dispatchers;
    private final File generatedAvatarDir;
    private final File userAvatarDir;

    @Inject
    public AvatarsStorageImpl(AuthDataProvider authDataProvider, Context context, CoroutineDispatchers dispatchers) {
        Intrinsics.checkNotNullParameter(authDataProvider, "authDataProvider");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.authDataProvider = authDataProvider;
        this.dispatchers = dispatchers;
        this.avatarDir = new File(context.getCacheDir(), AVATARS_DIR);
        this.generatedAvatarDir = new File(getAvatarDir(), GENERATED_AVATARS_DIR);
        this.userAvatarDir = new File(getAvatarDir(), USER_AVATARS_DIR);
    }

    private final File getAvatarDir() {
        File file = this.avatarDir;
        file.mkdirs();
        return file;
    }

    private final File getGeneratedAvatarDir() {
        File file = this.generatedAvatarDir;
        file.mkdirs();
        return file;
    }

    private final File getUserAvatarDir() {
        File file = this.userAvatarDir;
        file.mkdirs();
        return file;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    @Override // com.ifriend.domain.data.generateAvatar.AvatarsStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object saveGeneratedAvatar(FileFormat fileFormat, String str, InputStream inputStream, Continuation<? super String> continuation) {
        AvatarsStorageImpl$saveGeneratedAvatar$1 avatarsStorageImpl$saveGeneratedAvatar$1;
        int i;
        File file;
        if (continuation instanceof AvatarsStorageImpl$saveGeneratedAvatar$1) {
            avatarsStorageImpl$saveGeneratedAvatar$1 = (AvatarsStorageImpl$saveGeneratedAvatar$1) continuation;
            if ((avatarsStorageImpl$saveGeneratedAvatar$1.label & Integer.MIN_VALUE) != 0) {
                avatarsStorageImpl$saveGeneratedAvatar$1.label -= Integer.MIN_VALUE;
                Object obj = avatarsStorageImpl$saveGeneratedAvatar$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = avatarsStorageImpl$saveGeneratedAvatar$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    File file2 = new File(getGeneratedAvatarDir(), fileFormat.makePath(str));
                    avatarsStorageImpl$saveGeneratedAvatar$1.L$0 = file2;
                    avatarsStorageImpl$saveGeneratedAvatar$1.label = 1;
                    if (saveFile(file2, inputStream, avatarsStorageImpl$saveGeneratedAvatar$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    file = file2;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    file = (File) avatarsStorageImpl$saveGeneratedAvatar$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                Uri fromFile = Uri.fromFile(file);
                Intrinsics.checkNotNullExpressionValue(fromFile, "fromFile(this)");
                String uri = fromFile.toString();
                Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                return uri;
            }
        }
        avatarsStorageImpl$saveGeneratedAvatar$1 = new AvatarsStorageImpl$saveGeneratedAvatar$1(this, continuation);
        Object obj2 = avatarsStorageImpl$saveGeneratedAvatar$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = avatarsStorageImpl$saveGeneratedAvatar$1.label;
        if (i != 0) {
        }
        Uri fromFile2 = Uri.fromFile(file);
        Intrinsics.checkNotNullExpressionValue(fromFile2, "fromFile(this)");
        String uri2 = fromFile2.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
        return uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // com.ifriend.domain.data.generateAvatar.AvatarsStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getGeneratedAvatar(FileFormat fileFormat, String str, Continuation<? super byte[]> continuation) {
        AvatarsStorageImpl$getGeneratedAvatar$1 avatarsStorageImpl$getGeneratedAvatar$1;
        int i;
        AvatarsStorageImpl avatarsStorageImpl;
        File file;
        if (continuation instanceof AvatarsStorageImpl$getGeneratedAvatar$1) {
            avatarsStorageImpl$getGeneratedAvatar$1 = (AvatarsStorageImpl$getGeneratedAvatar$1) continuation;
            if ((avatarsStorageImpl$getGeneratedAvatar$1.label & Integer.MIN_VALUE) != 0) {
                avatarsStorageImpl$getGeneratedAvatar$1.label -= Integer.MIN_VALUE;
                Object obj = avatarsStorageImpl$getGeneratedAvatar$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = avatarsStorageImpl$getGeneratedAvatar$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    avatarsStorageImpl$getGeneratedAvatar$1.L$0 = this;
                    avatarsStorageImpl$getGeneratedAvatar$1.label = 1;
                    obj = getAvatarFile(fileFormat, str, false, avatarsStorageImpl$getGeneratedAvatar$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    avatarsStorageImpl = this;
                } else if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return (byte[]) obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    avatarsStorageImpl = (AvatarsStorageImpl) avatarsStorageImpl$getGeneratedAvatar$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                file = (File) obj;
                if (file == null) {
                    avatarsStorageImpl$getGeneratedAvatar$1.L$0 = null;
                    avatarsStorageImpl$getGeneratedAvatar$1.label = 2;
                    obj = avatarsStorageImpl.readFile(file, avatarsStorageImpl$getGeneratedAvatar$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return (byte[]) obj;
                }
                return null;
            }
        }
        avatarsStorageImpl$getGeneratedAvatar$1 = new AvatarsStorageImpl$getGeneratedAvatar$1(this, continuation);
        Object obj2 = avatarsStorageImpl$getGeneratedAvatar$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = avatarsStorageImpl$getGeneratedAvatar$1.label;
        if (i != 0) {
        }
        file = (File) obj2;
        if (file == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    @Override // com.ifriend.domain.data.generateAvatar.AvatarsStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getGeneratedAvatarUri(FileFormat fileFormat, String str, Continuation<? super String> continuation) {
        AvatarsStorageImpl$getGeneratedAvatarUri$1 avatarsStorageImpl$getGeneratedAvatarUri$1;
        int i;
        File file;
        if (continuation instanceof AvatarsStorageImpl$getGeneratedAvatarUri$1) {
            avatarsStorageImpl$getGeneratedAvatarUri$1 = (AvatarsStorageImpl$getGeneratedAvatarUri$1) continuation;
            if ((avatarsStorageImpl$getGeneratedAvatarUri$1.label & Integer.MIN_VALUE) != 0) {
                avatarsStorageImpl$getGeneratedAvatarUri$1.label -= Integer.MIN_VALUE;
                Object obj = avatarsStorageImpl$getGeneratedAvatarUri$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = avatarsStorageImpl$getGeneratedAvatarUri$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    avatarsStorageImpl$getGeneratedAvatarUri$1.label = 1;
                    obj = getAvatarFile(fileFormat, str, false, avatarsStorageImpl$getGeneratedAvatarUri$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                file = (File) obj;
                if (file != null) {
                    Uri fromFile = Uri.fromFile(file);
                    Intrinsics.checkNotNullExpressionValue(fromFile, "fromFile(this)");
                    if (fromFile != null) {
                        return fromFile.toString();
                    }
                }
                return null;
            }
        }
        avatarsStorageImpl$getGeneratedAvatarUri$1 = new AvatarsStorageImpl$getGeneratedAvatarUri$1(this, continuation);
        Object obj2 = avatarsStorageImpl$getGeneratedAvatarUri$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = avatarsStorageImpl$getGeneratedAvatarUri$1.label;
        if (i != 0) {
        }
        file = (File) obj2;
        if (file != null) {
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0066 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getAvatarFile(FileFormat fileFormat, String str, boolean z, Continuation<? super File> continuation) {
        AvatarsStorageImpl$getAvatarFile$1 avatarsStorageImpl$getAvatarFile$1;
        int i;
        File generatedAvatarDir;
        File file;
        if (continuation instanceof AvatarsStorageImpl$getAvatarFile$1) {
            avatarsStorageImpl$getAvatarFile$1 = (AvatarsStorageImpl$getAvatarFile$1) continuation;
            if ((avatarsStorageImpl$getAvatarFile$1.label & Integer.MIN_VALUE) != 0) {
                avatarsStorageImpl$getAvatarFile$1.label -= Integer.MIN_VALUE;
                Object obj = avatarsStorageImpl$getAvatarFile$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = avatarsStorageImpl$getAvatarFile$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (z) {
                        avatarsStorageImpl$getAvatarFile$1.L$0 = fileFormat;
                        avatarsStorageImpl$getAvatarFile$1.L$1 = str;
                        avatarsStorageImpl$getAvatarFile$1.label = 1;
                        obj = getCurrentUserDir(avatarsStorageImpl$getAvatarFile$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        generatedAvatarDir = getGeneratedAvatarDir();
                        file = new File(generatedAvatarDir, fileFormat.makePath(str));
                        if (file.exists()) {
                            return file;
                        }
                        return null;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    FileFormat fileFormat2 = (FileFormat) avatarsStorageImpl$getAvatarFile$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    str = (String) avatarsStorageImpl$getAvatarFile$1.L$1;
                    fileFormat = fileFormat2;
                }
                generatedAvatarDir = (File) obj;
                file = new File(generatedAvatarDir, fileFormat.makePath(str));
                if (file.exists()) {
                }
            }
        }
        avatarsStorageImpl$getAvatarFile$1 = new AvatarsStorageImpl$getAvatarFile$1(this, continuation);
        Object obj2 = avatarsStorageImpl$getAvatarFile$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = avatarsStorageImpl$getAvatarFile$1.label;
        if (i != 0) {
        }
        generatedAvatarDir = (File) obj2;
        file = new File(generatedAvatarDir, fileFormat.makePath(str));
        if (file.exists()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0064 -> B:21:0x0067). Please submit an issue!!! */
    @Override // com.ifriend.domain.data.generateAvatar.AvatarsStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object deleteAllGeneratedAvatars(Continuation<? super Unit> continuation) {
        AvatarsStorageImpl$deleteAllGeneratedAvatars$1 avatarsStorageImpl$deleteAllGeneratedAvatars$1;
        int i;
        int length;
        int i2;
        AvatarsStorageImpl avatarsStorageImpl;
        File[] fileArr;
        if (continuation instanceof AvatarsStorageImpl$deleteAllGeneratedAvatars$1) {
            avatarsStorageImpl$deleteAllGeneratedAvatars$1 = (AvatarsStorageImpl$deleteAllGeneratedAvatars$1) continuation;
            if ((avatarsStorageImpl$deleteAllGeneratedAvatars$1.label & Integer.MIN_VALUE) != 0) {
                avatarsStorageImpl$deleteAllGeneratedAvatars$1.label -= Integer.MIN_VALUE;
                Object obj = avatarsStorageImpl$deleteAllGeneratedAvatars$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = avatarsStorageImpl$deleteAllGeneratedAvatars$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    File[] listFiles = getGeneratedAvatarDir().listFiles();
                    if (listFiles != null) {
                        length = listFiles.length;
                        i2 = 0;
                        avatarsStorageImpl = this;
                        fileArr = listFiles;
                        if (i2 < length) {
                        }
                    }
                    return Unit.INSTANCE;
                } else if (i == 1) {
                    length = avatarsStorageImpl$deleteAllGeneratedAvatars$1.I$1;
                    i2 = avatarsStorageImpl$deleteAllGeneratedAvatars$1.I$0;
                    fileArr = (File[]) avatarsStorageImpl$deleteAllGeneratedAvatars$1.L$1;
                    avatarsStorageImpl = (AvatarsStorageImpl) avatarsStorageImpl$deleteAllGeneratedAvatars$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    i2++;
                    if (i2 < length) {
                        File file = fileArr[i2];
                        Intrinsics.checkNotNull(file);
                        avatarsStorageImpl$deleteAllGeneratedAvatars$1.L$0 = avatarsStorageImpl;
                        avatarsStorageImpl$deleteAllGeneratedAvatars$1.L$1 = fileArr;
                        avatarsStorageImpl$deleteAllGeneratedAvatars$1.I$0 = i2;
                        avatarsStorageImpl$deleteAllGeneratedAvatars$1.I$1 = length;
                        avatarsStorageImpl$deleteAllGeneratedAvatars$1.label = 1;
                        if (avatarsStorageImpl.deleteFile(file, avatarsStorageImpl$deleteAllGeneratedAvatars$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i2++;
                        if (i2 < length) {
                        }
                    }
                    return Unit.INSTANCE;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        avatarsStorageImpl$deleteAllGeneratedAvatars$1 = new AvatarsStorageImpl$deleteAllGeneratedAvatars$1(this, continuation);
        Object obj2 = avatarsStorageImpl$deleteAllGeneratedAvatars$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = avatarsStorageImpl$deleteAllGeneratedAvatars$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e4  */
    @Override // com.ifriend.domain.data.generateAvatar.AvatarsStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateUserAvatarByGenerated(String str, Continuation<? super Unit> continuation) {
        AvatarsStorageImpl$updateUserAvatarByGenerated$1 avatarsStorageImpl$updateUserAvatarByGenerated$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        AvatarsStorageImpl avatarsStorageImpl;
        String str2;
        AvatarsStorageImpl avatarsStorageImpl2;
        String str3;
        AvatarsStorageImpl avatarsStorageImpl3;
        byte[] bArr;
        AvatarsStorageImpl avatarsStorageImpl4;
        byte[] bArr2;
        if (continuation instanceof AvatarsStorageImpl$updateUserAvatarByGenerated$1) {
            avatarsStorageImpl$updateUserAvatarByGenerated$1 = (AvatarsStorageImpl$updateUserAvatarByGenerated$1) continuation;
            if ((avatarsStorageImpl$updateUserAvatarByGenerated$1.label & Integer.MIN_VALUE) != 0) {
                avatarsStorageImpl$updateUserAvatarByGenerated$1.label -= Integer.MIN_VALUE;
                obj = avatarsStorageImpl$updateUserAvatarByGenerated$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = avatarsStorageImpl$updateUserAvatarByGenerated$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    avatarsStorageImpl$updateUserAvatarByGenerated$1.L$0 = this;
                    avatarsStorageImpl$updateUserAvatarByGenerated$1.L$1 = str;
                    avatarsStorageImpl$updateUserAvatarByGenerated$1.L$2 = this;
                    avatarsStorageImpl$updateUserAvatarByGenerated$1.label = 1;
                    obj = getCurrentUserDir(avatarsStorageImpl$updateUserAvatarByGenerated$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    avatarsStorageImpl = this;
                    str2 = str;
                    avatarsStorageImpl2 = avatarsStorageImpl;
                } else if (i == 1) {
                    avatarsStorageImpl2 = (AvatarsStorageImpl) avatarsStorageImpl$updateUserAvatarByGenerated$1.L$2;
                    str2 = (String) avatarsStorageImpl$updateUserAvatarByGenerated$1.L$1;
                    avatarsStorageImpl = (AvatarsStorageImpl) avatarsStorageImpl$updateUserAvatarByGenerated$1.L$0;
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    str3 = (String) avatarsStorageImpl$updateUserAvatarByGenerated$1.L$1;
                    avatarsStorageImpl3 = (AvatarsStorageImpl) avatarsStorageImpl$updateUserAvatarByGenerated$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    bArr = (byte[]) obj;
                    if (bArr != null) {
                        avatarsStorageImpl$updateUserAvatarByGenerated$1.L$0 = avatarsStorageImpl3;
                        avatarsStorageImpl$updateUserAvatarByGenerated$1.L$1 = str3;
                        avatarsStorageImpl$updateUserAvatarByGenerated$1.label = 3;
                        if (avatarsStorageImpl3.saveUserAvatar(FileFormat.PNG, new ByteArrayInputStream(bArr), avatarsStorageImpl$updateUserAvatarByGenerated$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    String str4 = str3;
                    avatarsStorageImpl4 = avatarsStorageImpl3;
                    FileFormat fileFormat = FileFormat.MP4;
                    avatarsStorageImpl$updateUserAvatarByGenerated$1.L$0 = avatarsStorageImpl4;
                    avatarsStorageImpl$updateUserAvatarByGenerated$1.L$1 = null;
                    avatarsStorageImpl$updateUserAvatarByGenerated$1.label = 4;
                    obj = avatarsStorageImpl4.getGeneratedAvatar(fileFormat, str4, avatarsStorageImpl$updateUserAvatarByGenerated$1);
                    if (obj == coroutine_suspended) {
                    }
                    bArr2 = (byte[]) obj;
                    if (bArr2 == null) {
                    }
                } else if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    avatarsStorageImpl4 = (AvatarsStorageImpl) avatarsStorageImpl$updateUserAvatarByGenerated$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    bArr2 = (byte[]) obj;
                    if (bArr2 == null) {
                        avatarsStorageImpl$updateUserAvatarByGenerated$1.L$0 = null;
                        avatarsStorageImpl$updateUserAvatarByGenerated$1.label = 5;
                        if (avatarsStorageImpl4.saveUserAvatar(FileFormat.MP4, new ByteArrayInputStream(bArr2), avatarsStorageImpl$updateUserAvatarByGenerated$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                } else {
                    str3 = (String) avatarsStorageImpl$updateUserAvatarByGenerated$1.L$1;
                    avatarsStorageImpl3 = (AvatarsStorageImpl) avatarsStorageImpl$updateUserAvatarByGenerated$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    String str42 = str3;
                    avatarsStorageImpl4 = avatarsStorageImpl3;
                    FileFormat fileFormat2 = FileFormat.MP4;
                    avatarsStorageImpl$updateUserAvatarByGenerated$1.L$0 = avatarsStorageImpl4;
                    avatarsStorageImpl$updateUserAvatarByGenerated$1.L$1 = null;
                    avatarsStorageImpl$updateUserAvatarByGenerated$1.label = 4;
                    obj = avatarsStorageImpl4.getGeneratedAvatar(fileFormat2, str42, avatarsStorageImpl$updateUserAvatarByGenerated$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    bArr2 = (byte[]) obj;
                    if (bArr2 == null) {
                    }
                }
                avatarsStorageImpl2.deleteDirectory((File) obj);
                FileFormat fileFormat3 = FileFormat.PNG;
                avatarsStorageImpl$updateUserAvatarByGenerated$1.L$0 = avatarsStorageImpl;
                avatarsStorageImpl$updateUserAvatarByGenerated$1.L$1 = str2;
                avatarsStorageImpl$updateUserAvatarByGenerated$1.L$2 = null;
                avatarsStorageImpl$updateUserAvatarByGenerated$1.label = 2;
                obj = avatarsStorageImpl.getGeneratedAvatar(fileFormat3, str2, avatarsStorageImpl$updateUserAvatarByGenerated$1);
                if (obj != coroutine_suspended) {
                    return coroutine_suspended;
                }
                str3 = str2;
                avatarsStorageImpl3 = avatarsStorageImpl;
                bArr = (byte[]) obj;
                if (bArr != null) {
                }
                String str422 = str3;
                avatarsStorageImpl4 = avatarsStorageImpl3;
                FileFormat fileFormat22 = FileFormat.MP4;
                avatarsStorageImpl$updateUserAvatarByGenerated$1.L$0 = avatarsStorageImpl4;
                avatarsStorageImpl$updateUserAvatarByGenerated$1.L$1 = null;
                avatarsStorageImpl$updateUserAvatarByGenerated$1.label = 4;
                obj = avatarsStorageImpl4.getGeneratedAvatar(fileFormat22, str422, avatarsStorageImpl$updateUserAvatarByGenerated$1);
                if (obj == coroutine_suspended) {
                }
                bArr2 = (byte[]) obj;
                if (bArr2 == null) {
                }
            }
        }
        avatarsStorageImpl$updateUserAvatarByGenerated$1 = new AvatarsStorageImpl$updateUserAvatarByGenerated$1(this, continuation);
        obj = avatarsStorageImpl$updateUserAvatarByGenerated$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = avatarsStorageImpl$updateUserAvatarByGenerated$1.label;
        if (i != 0) {
        }
        avatarsStorageImpl2.deleteDirectory((File) obj);
        FileFormat fileFormat32 = FileFormat.PNG;
        avatarsStorageImpl$updateUserAvatarByGenerated$1.L$0 = avatarsStorageImpl;
        avatarsStorageImpl$updateUserAvatarByGenerated$1.L$1 = str2;
        avatarsStorageImpl$updateUserAvatarByGenerated$1.L$2 = null;
        avatarsStorageImpl$updateUserAvatarByGenerated$1.label = 2;
        obj = avatarsStorageImpl.getGeneratedAvatar(fileFormat32, str2, avatarsStorageImpl$updateUserAvatarByGenerated$1);
        if (obj != coroutine_suspended) {
        }
    }

    private final void deleteDirectory(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                Intrinsics.checkNotNull(file2);
                deleteDirectory(file2);
            } else {
                file2.delete();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    @Override // com.ifriend.domain.data.generateAvatar.AvatarsStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object saveUserAvatar(FileFormat fileFormat, InputStream inputStream, Continuation<? super String> continuation) {
        AvatarsStorageImpl$saveUserAvatar$1 avatarsStorageImpl$saveUserAvatar$1;
        Object coroutine_suspended;
        int i;
        AvatarsStorageImpl avatarsStorageImpl;
        File file;
        File file2;
        if (continuation instanceof AvatarsStorageImpl$saveUserAvatar$1) {
            avatarsStorageImpl$saveUserAvatar$1 = (AvatarsStorageImpl$saveUserAvatar$1) continuation;
            if ((avatarsStorageImpl$saveUserAvatar$1.label & Integer.MIN_VALUE) != 0) {
                avatarsStorageImpl$saveUserAvatar$1.label -= Integer.MIN_VALUE;
                Object obj = avatarsStorageImpl$saveUserAvatar$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = avatarsStorageImpl$saveUserAvatar$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    avatarsStorageImpl$saveUserAvatar$1.L$0 = this;
                    avatarsStorageImpl$saveUserAvatar$1.L$1 = fileFormat;
                    avatarsStorageImpl$saveUserAvatar$1.L$2 = inputStream;
                    avatarsStorageImpl$saveUserAvatar$1.label = 1;
                    obj = getCurrentUserDir(avatarsStorageImpl$saveUserAvatar$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    avatarsStorageImpl = this;
                } else if (i != 1) {
                    if (i == 2) {
                        file2 = (File) avatarsStorageImpl$saveUserAvatar$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        Uri fromFile = Uri.fromFile(file2);
                        Intrinsics.checkNotNullExpressionValue(fromFile, "fromFile(this)");
                        String uri = fromFile.toString();
                        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                        return uri;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    inputStream = (InputStream) avatarsStorageImpl$saveUserAvatar$1.L$2;
                    fileFormat = (FileFormat) avatarsStorageImpl$saveUserAvatar$1.L$1;
                    avatarsStorageImpl = (AvatarsStorageImpl) avatarsStorageImpl$saveUserAvatar$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                file = new File((File) obj, fileFormat.makePath(USER_AVATAR));
                avatarsStorageImpl$saveUserAvatar$1.L$0 = file;
                avatarsStorageImpl$saveUserAvatar$1.L$1 = null;
                avatarsStorageImpl$saveUserAvatar$1.L$2 = null;
                avatarsStorageImpl$saveUserAvatar$1.label = 2;
                if (avatarsStorageImpl.saveFile(file, inputStream, avatarsStorageImpl$saveUserAvatar$1) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                file2 = file;
                Uri fromFile2 = Uri.fromFile(file2);
                Intrinsics.checkNotNullExpressionValue(fromFile2, "fromFile(this)");
                String uri2 = fromFile2.toString();
                Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
                return uri2;
            }
        }
        avatarsStorageImpl$saveUserAvatar$1 = new AvatarsStorageImpl$saveUserAvatar$1(this, continuation);
        Object obj2 = avatarsStorageImpl$saveUserAvatar$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = avatarsStorageImpl$saveUserAvatar$1.label;
        if (i != 0) {
        }
        file = new File((File) obj2, fileFormat.makePath(USER_AVATAR));
        avatarsStorageImpl$saveUserAvatar$1.L$0 = file;
        avatarsStorageImpl$saveUserAvatar$1.L$1 = null;
        avatarsStorageImpl$saveUserAvatar$1.L$2 = null;
        avatarsStorageImpl$saveUserAvatar$1.label = 2;
        if (avatarsStorageImpl.saveFile(file, inputStream, avatarsStorageImpl$saveUserAvatar$1) != coroutine_suspended) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // com.ifriend.domain.data.generateAvatar.AvatarsStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getUserAvatar(FileFormat fileFormat, Continuation<? super byte[]> continuation) {
        AvatarsStorageImpl$getUserAvatar$1 avatarsStorageImpl$getUserAvatar$1;
        int i;
        AvatarsStorageImpl avatarsStorageImpl;
        File file;
        if (continuation instanceof AvatarsStorageImpl$getUserAvatar$1) {
            avatarsStorageImpl$getUserAvatar$1 = (AvatarsStorageImpl$getUserAvatar$1) continuation;
            if ((avatarsStorageImpl$getUserAvatar$1.label & Integer.MIN_VALUE) != 0) {
                avatarsStorageImpl$getUserAvatar$1.label -= Integer.MIN_VALUE;
                Object obj = avatarsStorageImpl$getUserAvatar$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = avatarsStorageImpl$getUserAvatar$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    avatarsStorageImpl$getUserAvatar$1.L$0 = this;
                    avatarsStorageImpl$getUserAvatar$1.label = 1;
                    obj = getAvatarFile(fileFormat, USER_AVATAR, true, avatarsStorageImpl$getUserAvatar$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    avatarsStorageImpl = this;
                } else if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return (byte[]) obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    avatarsStorageImpl = (AvatarsStorageImpl) avatarsStorageImpl$getUserAvatar$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                file = (File) obj;
                if (file == null) {
                    avatarsStorageImpl$getUserAvatar$1.L$0 = null;
                    avatarsStorageImpl$getUserAvatar$1.label = 2;
                    obj = avatarsStorageImpl.readFile(file, avatarsStorageImpl$getUserAvatar$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return (byte[]) obj;
                }
                return null;
            }
        }
        avatarsStorageImpl$getUserAvatar$1 = new AvatarsStorageImpl$getUserAvatar$1(this, continuation);
        Object obj2 = avatarsStorageImpl$getUserAvatar$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = avatarsStorageImpl$getUserAvatar$1.label;
        if (i != 0) {
        }
        file = (File) obj2;
        if (file == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getCurrentUserDir(Continuation<? super File> continuation) {
        AvatarsStorageImpl$getCurrentUserDir$1 avatarsStorageImpl$getCurrentUserDir$1;
        int i;
        File file;
        AuthData authData;
        File file2;
        UserId userId;
        if (continuation instanceof AvatarsStorageImpl$getCurrentUserDir$1) {
            avatarsStorageImpl$getCurrentUserDir$1 = (AvatarsStorageImpl$getCurrentUserDir$1) continuation;
            if ((avatarsStorageImpl$getCurrentUserDir$1.label & Integer.MIN_VALUE) != 0) {
                avatarsStorageImpl$getCurrentUserDir$1.label -= Integer.MIN_VALUE;
                Object obj = avatarsStorageImpl$getCurrentUserDir$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = avatarsStorageImpl$getCurrentUserDir$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    File userAvatarDir = getUserAvatarDir();
                    AuthDataProvider authDataProvider = this.authDataProvider;
                    avatarsStorageImpl$getCurrentUserDir$1.L$0 = userAvatarDir;
                    avatarsStorageImpl$getCurrentUserDir$1.label = 1;
                    Object lastAuthData = authDataProvider.lastAuthData(avatarsStorageImpl$getCurrentUserDir$1);
                    if (lastAuthData == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    file = userAvatarDir;
                    obj = lastAuthData;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    file = (File) avatarsStorageImpl$getCurrentUserDir$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                authData = (AuthData) obj;
                if (authData != null || (userId = authData.getUserId()) == null || (r6 = userId.getValue()) == null) {
                    String str = CookieSpecs.DEFAULT;
                }
                file2 = new File(file, str);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                return file2;
            }
        }
        avatarsStorageImpl$getCurrentUserDir$1 = new AvatarsStorageImpl$getCurrentUserDir$1(this, continuation);
        Object obj2 = avatarsStorageImpl$getCurrentUserDir$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = avatarsStorageImpl$getCurrentUserDir$1.label;
        if (i != 0) {
        }
        authData = (AuthData) obj2;
        if (authData != null) {
        }
        String str2 = CookieSpecs.DEFAULT;
        file2 = new File(file, str2);
        if (!file2.exists()) {
        }
        return file2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    @Override // com.ifriend.domain.data.generateAvatar.AvatarsStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getUserAvatarUri(FileFormat fileFormat, Continuation<? super String> continuation) {
        AvatarsStorageImpl$getUserAvatarUri$1 avatarsStorageImpl$getUserAvatarUri$1;
        int i;
        File file;
        if (continuation instanceof AvatarsStorageImpl$getUserAvatarUri$1) {
            avatarsStorageImpl$getUserAvatarUri$1 = (AvatarsStorageImpl$getUserAvatarUri$1) continuation;
            if ((avatarsStorageImpl$getUserAvatarUri$1.label & Integer.MIN_VALUE) != 0) {
                avatarsStorageImpl$getUserAvatarUri$1.label -= Integer.MIN_VALUE;
                Object obj = avatarsStorageImpl$getUserAvatarUri$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = avatarsStorageImpl$getUserAvatarUri$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    avatarsStorageImpl$getUserAvatarUri$1.label = 1;
                    obj = getAvatarFile(fileFormat, USER_AVATAR, true, avatarsStorageImpl$getUserAvatarUri$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                file = (File) obj;
                if (file != null) {
                    Uri fromFile = Uri.fromFile(file);
                    Intrinsics.checkNotNullExpressionValue(fromFile, "fromFile(this)");
                    if (fromFile != null) {
                        return fromFile.toString();
                    }
                }
                return null;
            }
        }
        avatarsStorageImpl$getUserAvatarUri$1 = new AvatarsStorageImpl$getUserAvatarUri$1(this, continuation);
        Object obj2 = avatarsStorageImpl$getUserAvatarUri$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = avatarsStorageImpl$getUserAvatarUri$1.label;
        if (i != 0) {
        }
        file = (File) obj2;
        if (file != null) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0064 -> B:21:0x0067). Please submit an issue!!! */
    @Override // com.ifriend.domain.data.generateAvatar.AvatarsStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object deleteUserAvatar(Continuation<? super Unit> continuation) {
        AvatarsStorageImpl$deleteUserAvatar$1 avatarsStorageImpl$deleteUserAvatar$1;
        int i;
        int length;
        int i2;
        AvatarsStorageImpl avatarsStorageImpl;
        File[] fileArr;
        if (continuation instanceof AvatarsStorageImpl$deleteUserAvatar$1) {
            avatarsStorageImpl$deleteUserAvatar$1 = (AvatarsStorageImpl$deleteUserAvatar$1) continuation;
            if ((avatarsStorageImpl$deleteUserAvatar$1.label & Integer.MIN_VALUE) != 0) {
                avatarsStorageImpl$deleteUserAvatar$1.label -= Integer.MIN_VALUE;
                Object obj = avatarsStorageImpl$deleteUserAvatar$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = avatarsStorageImpl$deleteUserAvatar$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    File[] listFiles = getUserAvatarDir().listFiles();
                    if (listFiles != null) {
                        length = listFiles.length;
                        i2 = 0;
                        avatarsStorageImpl = this;
                        fileArr = listFiles;
                        if (i2 < length) {
                        }
                    }
                    return Unit.INSTANCE;
                } else if (i == 1) {
                    length = avatarsStorageImpl$deleteUserAvatar$1.I$1;
                    i2 = avatarsStorageImpl$deleteUserAvatar$1.I$0;
                    fileArr = (File[]) avatarsStorageImpl$deleteUserAvatar$1.L$1;
                    avatarsStorageImpl = (AvatarsStorageImpl) avatarsStorageImpl$deleteUserAvatar$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    i2++;
                    if (i2 < length) {
                        File file = fileArr[i2];
                        Intrinsics.checkNotNull(file);
                        avatarsStorageImpl$deleteUserAvatar$1.L$0 = avatarsStorageImpl;
                        avatarsStorageImpl$deleteUserAvatar$1.L$1 = fileArr;
                        avatarsStorageImpl$deleteUserAvatar$1.I$0 = i2;
                        avatarsStorageImpl$deleteUserAvatar$1.I$1 = length;
                        avatarsStorageImpl$deleteUserAvatar$1.label = 1;
                        if (avatarsStorageImpl.deleteFile(file, avatarsStorageImpl$deleteUserAvatar$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i2++;
                        if (i2 < length) {
                        }
                    }
                    return Unit.INSTANCE;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        avatarsStorageImpl$deleteUserAvatar$1 = new AvatarsStorageImpl$deleteUserAvatar$1(this, continuation);
        Object obj2 = avatarsStorageImpl$deleteUserAvatar$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = avatarsStorageImpl$deleteUserAvatar$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057 A[RETURN] */
    @Override // com.ifriend.domain.data.generateAvatar.AvatarsStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object clear(Continuation<? super Unit> continuation) {
        AvatarsStorageImpl$clear$1 avatarsStorageImpl$clear$1;
        Object coroutine_suspended;
        int i;
        AvatarsStorageImpl avatarsStorageImpl;
        if (continuation instanceof AvatarsStorageImpl$clear$1) {
            avatarsStorageImpl$clear$1 = (AvatarsStorageImpl$clear$1) continuation;
            if ((avatarsStorageImpl$clear$1.label & Integer.MIN_VALUE) != 0) {
                avatarsStorageImpl$clear$1.label -= Integer.MIN_VALUE;
                Object obj = avatarsStorageImpl$clear$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = avatarsStorageImpl$clear$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    avatarsStorageImpl$clear$1.L$0 = this;
                    avatarsStorageImpl$clear$1.label = 1;
                    if (deleteUserAvatar(avatarsStorageImpl$clear$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    avatarsStorageImpl = this;
                } else if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    avatarsStorageImpl = (AvatarsStorageImpl) avatarsStorageImpl$clear$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                avatarsStorageImpl$clear$1.L$0 = null;
                avatarsStorageImpl$clear$1.label = 2;
                if (avatarsStorageImpl.deleteAllGeneratedAvatars(avatarsStorageImpl$clear$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        avatarsStorageImpl$clear$1 = new AvatarsStorageImpl$clear$1(this, continuation);
        Object obj2 = avatarsStorageImpl$clear$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = avatarsStorageImpl$clear$1.label;
        if (i != 0) {
        }
        avatarsStorageImpl$clear$1.L$0 = null;
        avatarsStorageImpl$clear$1.label = 2;
        if (avatarsStorageImpl.deleteAllGeneratedAvatars(avatarsStorageImpl$clear$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object deleteFile(File file, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(this.dispatchers.getIO(), new AvatarsStorageImpl$deleteFile$2(file, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.io.File] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r6v4, types: [kotlin.Unit, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object saveFile(File file, InputStream inputStream, Continuation<? super Unit> continuation) {
        AvatarsStorageImpl$saveFile$1 avatarsStorageImpl$saveFile$1;
        int i;
        try {
            if (continuation instanceof AvatarsStorageImpl$saveFile$1) {
                avatarsStorageImpl$saveFile$1 = (AvatarsStorageImpl$saveFile$1) continuation;
                if ((avatarsStorageImpl$saveFile$1.label & Integer.MIN_VALUE) != 0) {
                    avatarsStorageImpl$saveFile$1.label -= Integer.MIN_VALUE;
                    Object obj = avatarsStorageImpl$saveFile$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = avatarsStorageImpl$saveFile$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        avatarsStorageImpl$saveFile$1.L$0 = file;
                        avatarsStorageImpl$saveFile$1.label = 1;
                        if (BuildersKt.withContext(this.dispatchers.getIO(), new AvatarsStorageImpl$saveFile$2(inputStream, file, null), avatarsStorageImpl$saveFile$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        File file2 = (File) avatarsStorageImpl$saveFile$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    file = Unit.INSTANCE;
                    return file;
                }
            }
            if (i != 0) {
            }
            file = Unit.INSTANCE;
            return file;
        } catch (StreamResetException unused) {
            file.delete();
            throw FailedToSaveAvatarException.INSTANCE;
        }
        avatarsStorageImpl$saveFile$1 = new AvatarsStorageImpl$saveFile$1(this, continuation);
        Object obj2 = avatarsStorageImpl$saveFile$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = avatarsStorageImpl$saveFile$1.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readFile(File file, Continuation<? super byte[]> continuation) {
        AvatarsStorageImpl$readFile$1 avatarsStorageImpl$readFile$1;
        int i;
        if (continuation instanceof AvatarsStorageImpl$readFile$1) {
            avatarsStorageImpl$readFile$1 = (AvatarsStorageImpl$readFile$1) continuation;
            if ((avatarsStorageImpl$readFile$1.label & Integer.MIN_VALUE) != 0) {
                avatarsStorageImpl$readFile$1.label -= Integer.MIN_VALUE;
                Object obj = avatarsStorageImpl$readFile$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = avatarsStorageImpl$readFile$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    avatarsStorageImpl$readFile$1.label = 1;
                    obj = BuildersKt.withContext(this.dispatchers.getIO(), new AvatarsStorageImpl$readFile$2(file, null), avatarsStorageImpl$readFile$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return ByteStreamsKt.readBytes((InputStream) obj);
            }
        }
        avatarsStorageImpl$readFile$1 = new AvatarsStorageImpl$readFile$1(this, continuation);
        Object obj2 = avatarsStorageImpl$readFile$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = avatarsStorageImpl$readFile$1.label;
        if (i != 0) {
        }
        return ByteStreamsKt.readBytes((InputStream) obj2);
    }

    /* compiled from: AvatarsStorage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ifriend/data/storages/avatar/AvatarsStorageImpl$Companion;", "", "()V", "AVATARS_DIR", "", "GENERATED_AVATARS_DIR", "USER_AVATAR", "USER_AVATARS_DIR", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: AvatarsStorage.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ifriend/data/storages/avatar/AvatarsStorageImpl$FailedToSaveAvatarException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class FailedToSaveAvatarException extends Exception {
        public static final FailedToSaveAvatarException INSTANCE = new FailedToSaveAvatarException();

        private FailedToSaveAvatarException() {
        }
    }
}
