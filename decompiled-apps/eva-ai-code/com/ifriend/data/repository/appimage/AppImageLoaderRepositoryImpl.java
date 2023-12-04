package com.ifriend.data.repository.appimage;

import android.content.Context;
import coil.ImageLoader;
import coil.request.CachePolicy;
import coil.request.ImageRequest;
import com.ifriend.domain.data.AppImageLoaderRepository;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
/* compiled from: AppImageLoaderRepositoryImpl.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0019\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/ifriend/data/repository/appimage/AppImageLoaderRepositoryImpl;", "Lcom/ifriend/domain/data/AppImageLoaderRepository;", "imageLoader", "Lcoil/ImageLoader;", "context", "Landroid/content/Context;", "(Lcoil/ImageLoader;Landroid/content/Context;)V", "addEnqueue", "", "imageUrl", "", "load", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppImageLoaderRepositoryImpl implements AppImageLoaderRepository {
    private final Context context;
    private final ImageLoader imageLoader;

    public AppImageLoaderRepositoryImpl(ImageLoader imageLoader, Context context) {
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(context, "context");
        this.imageLoader = imageLoader;
        this.context = context;
    }

    @Override // com.ifriend.domain.data.AppImageLoaderRepository
    public Object load(String str, Continuation<? super Unit> continuation) {
        Object execute;
        return (!StringsKt.isBlank(str) && (execute = this.imageLoader.execute(new ImageRequest.Builder(this.context).data(str).diskCachePolicy(CachePolicy.ENABLED).build(), continuation)) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? execute : Unit.INSTANCE;
    }

    @Override // com.ifriend.domain.data.AppImageLoaderRepository
    public void addEnqueue(String imageUrl) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        if (StringsKt.isBlank(imageUrl)) {
            return;
        }
        this.imageLoader.enqueue(new ImageRequest.Builder(this.context).data(imageUrl).diskCachePolicy(CachePolicy.ENABLED).build());
    }
}
