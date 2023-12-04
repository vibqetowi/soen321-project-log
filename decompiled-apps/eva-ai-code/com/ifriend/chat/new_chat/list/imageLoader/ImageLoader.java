package com.ifriend.chat.new_chat.list.imageLoader;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.RequestBuilder;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
/* compiled from: ImageLoader.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J3\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\nH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ-\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\nH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/ifriend/chat/new_chat/list/imageLoader/ImageLoader;", "", "builder", "Lcom/bumptech/glide/RequestBuilder;", "Landroid/graphics/drawable/Drawable;", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "url", "", "placeholder", "", "(Landroid/view/View;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "", "Landroid/widget/ImageView;", "(Landroid/widget/ImageView;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ImageLoader {
    Object builder(View view, String str, Integer num, Continuation<? super RequestBuilder<Drawable>> continuation);

    Object load(ImageView imageView, String str, Integer num, Continuation<? super Unit> continuation);

    /* compiled from: ImageLoader.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object builder$default(ImageLoader imageLoader, View view, String str, Integer num, Continuation continuation, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    num = null;
                }
                return imageLoader.builder(view, str, num, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: builder");
        }

        public static /* synthetic */ Object load$default(ImageLoader imageLoader, ImageView imageView, String str, Integer num, Continuation continuation, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    num = null;
                }
                return imageLoader.load(imageView, str, num, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: load");
        }
    }
}
