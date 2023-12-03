package sk;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.webkit.ConsoleMessage;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.theinnerhour.b2b.components.community.activity.CommunitiesPwaActivity;
import kotlin.jvm.internal.i;
/* compiled from: CommunitiesPwaActivity.kt */
/* loaded from: classes2.dex */
public final class b extends WebChromeClient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CommunitiesPwaActivity f31644a;

    public b(CommunitiesPwaActivity communitiesPwaActivity) {
        this.f31644a = communitiesPwaActivity;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage cm2) {
        i.g(cm2, "cm");
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest request) {
        i.g(request, "request");
        request.grant(request.getResources());
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Uri uri;
        Uri uri2;
        CommunitiesPwaActivity communitiesPwaActivity = this.f31644a;
        communitiesPwaActivity.f10636y = valueCallback;
        int i6 = Build.VERSION.SDK_INT;
        int i10 = communitiesPwaActivity.f10637z;
        if (i6 >= 29) {
            if (i.b(Build.MANUFACTURER, "samsung")) {
                try {
                    Intent intent = new Intent("android.intent.action.GET_CONTENT");
                    intent.setType("*/*");
                    communitiesPwaActivity.startActivityForResult(Intent.createChooser(intent, "Select File"), i10);
                    return true;
                } catch (Exception unused) {
                    Intent intent2 = new Intent("android.intent.action.PICK");
                    uri = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
                    intent2.setDataAndType(uri, "*/*");
                    communitiesPwaActivity.startActivityForResult(Intent.createChooser(intent2, "Select File"), i10);
                    return true;
                }
            }
            Intent intent3 = new Intent("android.intent.action.PICK");
            uri2 = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
            intent3.setDataAndType(uri2, "*/*");
            communitiesPwaActivity.startActivityForResult(Intent.createChooser(intent3, "Select File"), i10);
            return true;
        }
        Intent intent4 = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent4.addCategory("android.intent.category.OPENABLE");
        intent4.setType("image/*");
        communitiesPwaActivity.startActivityForResult(intent4, i10);
        return true;
    }
}
