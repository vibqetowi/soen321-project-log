package com.ifriend.chat.new_chat.list.imageLoader;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import androidx.core.net.UriKt;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.LazyHeaders;
import com.bumptech.glide.load.resource.bitmap.Downsampler;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.domain.data.AuthDataProvider;
import com.ifriend.domain.models.profile.user.AuthData;
import com.ifriend.domain.models.profile.user.UserToken;
import java.io.File;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ImageLoaderImpl.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J1\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000bH\u0002J\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000bH\u0002J+\u0010\u0016\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/ifriend/chat/new_chat/list/imageLoader/ImageLoaderImpl;", "Lcom/ifriend/chat/new_chat/list/imageLoader/ImageLoader;", "authDataProvider", "Lcom/ifriend/domain/data/AuthDataProvider;", "(Lcom/ifriend/domain/data/AuthDataProvider;)V", "builder", "Lcom/bumptech/glide/RequestBuilder;", "Landroid/graphics/drawable/Drawable;", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "url", "", "placeholder", "", "(Landroid/view/View;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createLocalFileUrl", "Ljava/io/File;", "createRemoteGlideUrl", "Lcom/bumptech/glide/load/model/GlideUrl;", "token", "createUrl", "", "load", "", "Landroid/widget/ImageView;", "(Landroid/widget/ImageView;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ImageLoaderImpl implements ImageLoader {
    public static final int $stable = 8;
    private final AuthDataProvider authDataProvider;

    @Inject
    public ImageLoaderImpl(AuthDataProvider authDataProvider) {
        Intrinsics.checkNotNullParameter(authDataProvider, "authDataProvider");
        this.authDataProvider = authDataProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    @Override // com.ifriend.chat.new_chat.list.imageLoader.ImageLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object builder(View view, String str, Integer num, Continuation<? super RequestBuilder<Drawable>> continuation) {
        ImageLoaderImpl$builder$1 imageLoaderImpl$builder$1;
        int i;
        ImageLoaderImpl imageLoaderImpl;
        UserToken token;
        if (continuation instanceof ImageLoaderImpl$builder$1) {
            imageLoaderImpl$builder$1 = (ImageLoaderImpl$builder$1) continuation;
            if ((imageLoaderImpl$builder$1.label & Integer.MIN_VALUE) != 0) {
                imageLoaderImpl$builder$1.label -= Integer.MIN_VALUE;
                Object obj = imageLoaderImpl$builder$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = imageLoaderImpl$builder$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    AuthDataProvider authDataProvider = this.authDataProvider;
                    imageLoaderImpl$builder$1.L$0 = this;
                    imageLoaderImpl$builder$1.L$1 = view;
                    imageLoaderImpl$builder$1.L$2 = str;
                    imageLoaderImpl$builder$1.L$3 = num;
                    imageLoaderImpl$builder$1.label = 1;
                    obj = authDataProvider.lastAuthData(imageLoaderImpl$builder$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    imageLoaderImpl = this;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    num = (Integer) imageLoaderImpl$builder$1.L$3;
                    str = (String) imageLoaderImpl$builder$1.L$2;
                    view = (View) imageLoaderImpl$builder$1.L$1;
                    imageLoaderImpl = (ImageLoaderImpl) imageLoaderImpl$builder$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                AuthData authData = (AuthData) obj;
                RequestBuilder requestBuilder = Glide.with(view).load(imageLoaderImpl.createUrl(str, (authData != null || (token = authData.getToken()) == null) ? null : token.formatted())).set(Downsampler.ALLOW_HARDWARE_CONFIG, Boxing.boxBoolean(false));
                if (num != null) {
                    requestBuilder = requestBuilder.placeholder(num.intValue());
                }
                Intrinsics.checkNotNullExpressionValue(requestBuilder, "run(...)");
                return requestBuilder;
            }
        }
        imageLoaderImpl$builder$1 = new ImageLoaderImpl$builder$1(this, continuation);
        Object obj2 = imageLoaderImpl$builder$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = imageLoaderImpl$builder$1.label;
        if (i != 0) {
        }
        AuthData authData2 = (AuthData) obj2;
        RequestBuilder requestBuilder2 = Glide.with(view).load(imageLoaderImpl.createUrl(str, (authData2 != null || (token = authData2.getToken()) == null) ? null : token.formatted())).set(Downsampler.ALLOW_HARDWARE_CONFIG, Boxing.boxBoolean(false));
        if (num != null) {
        }
        Intrinsics.checkNotNullExpressionValue(requestBuilder2, "run(...)");
        return requestBuilder2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    @Override // com.ifriend.chat.new_chat.list.imageLoader.ImageLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object load(ImageView imageView, String str, Integer num, Continuation<? super Unit> continuation) {
        ImageLoaderImpl$load$1 imageLoaderImpl$load$1;
        int i;
        if (continuation instanceof ImageLoaderImpl$load$1) {
            imageLoaderImpl$load$1 = (ImageLoaderImpl$load$1) continuation;
            if ((imageLoaderImpl$load$1.label & Integer.MIN_VALUE) != 0) {
                imageLoaderImpl$load$1.label -= Integer.MIN_VALUE;
                Object obj = imageLoaderImpl$load$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = imageLoaderImpl$load$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    imageLoaderImpl$load$1.L$0 = imageView;
                    imageLoaderImpl$load$1.label = 1;
                    obj = builder(imageView, str, num, imageLoaderImpl$load$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    imageView = (ImageView) imageLoaderImpl$load$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                ((RequestBuilder) obj).into(imageView);
                return Unit.INSTANCE;
            }
        }
        imageLoaderImpl$load$1 = new ImageLoaderImpl$load$1(this, continuation);
        Object obj2 = imageLoaderImpl$load$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = imageLoaderImpl$load$1.label;
        if (i != 0) {
        }
        ((RequestBuilder) obj2).into(imageView);
        return Unit.INSTANCE;
    }

    private final Object createUrl(String str, String str2) {
        if (ImageLoaderKt.isLocalUrl(str)) {
            return createLocalFileUrl(str);
        }
        if (str2 != null) {
            return createRemoteGlideUrl(str, str2);
        }
        return null;
    }

    private final File createLocalFileUrl(String str) {
        Uri parse = Uri.parse(str);
        Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
        return UriKt.toFile(parse);
    }

    private final GlideUrl createRemoteGlideUrl(String str, String str2) {
        return new GlideUrl(str, new LazyHeaders.Builder().addHeader("Authorization", str2).build());
    }
}
