package com.ifriend.chat.presentation.ui.chat.photo;

import android.net.Uri;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import com.ifriend.base.navigation.impl.cicerone.FragmentScreen;
import com.ifriend.ui.base.ImagePickerObserver;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: PreviewSendImageScreen.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ifriend/chat/presentation/ui/chat/photo/PreviewSendImageScreen;", "Lcom/ifriend/base/navigation/impl/cicerone/FragmentScreen;", "imageUri", "Landroid/net/Uri;", "imagePickerObserver", "Lcom/ifriend/ui/base/ImagePickerObserver;", "chatId", "", "(Landroid/net/Uri;Lcom/ifriend/ui/base/ImagePickerObserver;Ljava/lang/String;)V", "createFragment", "Landroidx/fragment/app/Fragment;", "factory", "Landroidx/fragment/app/FragmentFactory;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PreviewSendImageScreen implements FragmentScreen {
    public static final int $stable = 8;
    private final String chatId;
    private final ImagePickerObserver imagePickerObserver;
    private final Uri imageUri;

    public PreviewSendImageScreen(Uri uri, ImagePickerObserver imagePickerObserver, String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.imageUri = uri;
        this.imagePickerObserver = imagePickerObserver;
        this.chatId = chatId;
    }

    public /* synthetic */ PreviewSendImageScreen(Uri uri, ImagePickerObserver imagePickerObserver, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uri, (i & 2) != 0 ? null : imagePickerObserver, str);
    }

    @Override // com.ifriend.base.navigation.impl.cicerone.FragmentScreen
    public boolean getClearContainer() {
        return FragmentScreen.DefaultImpls.getClearContainer(this);
    }

    @Override // com.ifriend.base.navigation.api.cicerone.Screen
    public String getScreenKey() {
        return FragmentScreen.DefaultImpls.getScreenKey(this);
    }

    @Override // com.ifriend.base.navigation.impl.cicerone.FragmentScreen
    public Fragment createFragment(FragmentFactory factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return PreviewSendImageFragment.Companion.newInstance(this.imageUri, this.imagePickerObserver, this.chatId);
    }
}
