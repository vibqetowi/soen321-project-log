package com.ifriend.chat.presentation.ui.chat.presentation.chat.ui;

import android.os.Build;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import permissions.dispatcher.PermissionUtils;
/* compiled from: ChatFragmentPermissionsDispatcher.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0004\u001a\n\u0010\n\u001a\u00020\u000b*\u00020\f\u001a\u001a\u0010\r\u001a\u00020\u000b*\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010\u001a\n\u0010\u0011\u001a\u00020\u000b*\u00020\f\u001a\n\u0010\u0012\u001a\u00020\u000b*\u00020\f\u001a\n\u0010\u0013\u001a\u00020\u000b*\u00020\f\"\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0003\"\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0003\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"PERMISSION_MAKEPHOTOCLICK", "", "", "[Ljava/lang/String;", "PERMISSION_SENDIMAGEFROMGALLERYCLICK", "PERMISSION_SENDIMAGEFROMGALLERYCLICKAPI33", "REQUEST_MAKEPHOTOCLICK", "", "REQUEST_SENDIMAGEFROMGALLERYCLICK", "REQUEST_SENDIMAGEFROMGALLERYCLICKAPI33", "makePhotoClickWithPermissionCheck", "", "Lcom/ifriend/chat/presentation/ui/chat/presentation/chat/ui/ChatFragment;", "onRequestPermissionsResult", "requestCode", "grantResults", "", "proceedSendImageFromGalleryClickPermissionRequest", "sendImageFromGalleryClickApi33WithPermissionCheck", "sendImageFromGalleryClickWithPermissionCheck", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatFragmentPermissionsDispatcher {
    private static final String[] PERMISSION_MAKEPHOTOCLICK = {"android.permission.CAMERA"};
    private static final String[] PERMISSION_SENDIMAGEFROMGALLERYCLICK = {"android.permission.READ_EXTERNAL_STORAGE"};
    private static final String[] PERMISSION_SENDIMAGEFROMGALLERYCLICKAPI33 = {"android.permission.READ_MEDIA_IMAGES"};
    private static final int REQUEST_MAKEPHOTOCLICK = 0;
    private static final int REQUEST_SENDIMAGEFROMGALLERYCLICK = 1;
    private static final int REQUEST_SENDIMAGEFROMGALLERYCLICKAPI33 = 2;

    public static final void sendImageFromGalleryClickApi33WithPermissionCheck(ChatFragment chatFragment) {
        Intrinsics.checkNotNullParameter(chatFragment, "<this>");
        String[] strArr = PERMISSION_SENDIMAGEFROMGALLERYCLICKAPI33;
        if (PermissionUtils.hasSelfPermissions(chatFragment.requireActivity(), (String[]) Arrays.copyOf(strArr, strArr.length))) {
            chatFragment.sendImageFromGalleryClickApi33();
        } else {
            chatFragment.requestPermissions(strArr, 2);
        }
    }

    public static final void sendImageFromGalleryClickWithPermissionCheck(ChatFragment chatFragment) {
        Intrinsics.checkNotNullParameter(chatFragment, "<this>");
        if (Build.VERSION.SDK_INT > 32) {
            chatFragment.sendImageFromGalleryClick();
            return;
        }
        String[] strArr = PERMISSION_SENDIMAGEFROMGALLERYCLICK;
        if (PermissionUtils.hasSelfPermissions(chatFragment.requireActivity(), (String[]) Arrays.copyOf(strArr, strArr.length))) {
            chatFragment.sendImageFromGalleryClick();
        } else if (PermissionUtils.shouldShowRequestPermissionRationale(chatFragment, (String[]) Arrays.copyOf(strArr, strArr.length))) {
            chatFragment.showAllowGalleryDialog();
        } else {
            chatFragment.requestPermissions(strArr, 1);
        }
    }

    public static final void makePhotoClickWithPermissionCheck(ChatFragment chatFragment) {
        Intrinsics.checkNotNullParameter(chatFragment, "<this>");
        String[] strArr = PERMISSION_MAKEPHOTOCLICK;
        if (PermissionUtils.hasSelfPermissions(chatFragment.requireActivity(), (String[]) Arrays.copyOf(strArr, strArr.length))) {
            chatFragment.makePhotoClick();
        } else {
            chatFragment.requestPermissions(strArr, 0);
        }
    }

    public static final void proceedSendImageFromGalleryClickPermissionRequest(ChatFragment chatFragment) {
        Intrinsics.checkNotNullParameter(chatFragment, "<this>");
        chatFragment.requestPermissions(PERMISSION_SENDIMAGEFROMGALLERYCLICK, 1);
    }

    public static final void onRequestPermissionsResult(ChatFragment chatFragment, int i, int[] grantResults) {
        Intrinsics.checkNotNullParameter(chatFragment, "<this>");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (i == 0) {
            if (PermissionUtils.verifyPermissions(Arrays.copyOf(grantResults, grantResults.length))) {
                chatFragment.makePhotoClick();
            }
        } else if (i != 1) {
            if (i == 2 && PermissionUtils.verifyPermissions(Arrays.copyOf(grantResults, grantResults.length))) {
                chatFragment.sendImageFromGalleryClickApi33();
            }
        } else if (PermissionUtils.verifyPermissions(Arrays.copyOf(grantResults, grantResults.length))) {
            chatFragment.sendImageFromGalleryClick();
        }
    }
}
