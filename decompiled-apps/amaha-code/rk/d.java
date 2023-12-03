package rk;

import android.net.Uri;
import com.google.firebase.storage.StorageMetadata;
import com.google.firebase.storage.UploadTask;
import com.theinnerhour.b2b.components.chat.model.ChatUser;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.HashMap;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import ss.l;
/* compiled from: ChatViewModel.kt */
/* loaded from: classes2.dex */
public final class d extends k implements l<Uri, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ UploadTask.TaskSnapshot f30773u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ f f30774v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f30775w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ boolean f30776x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ String f30777y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(UploadTask.TaskSnapshot taskSnapshot, f fVar, String str, boolean z10, String str2) {
        super(1);
        this.f30773u = taskSnapshot;
        this.f30774v = fVar;
        this.f30775w = str;
        this.f30776x = z10;
        this.f30777y = str2;
    }

    @Override // ss.l
    public final hs.k invoke(Uri uri) {
        String str;
        Uri uri2 = uri;
        UploadTask.TaskSnapshot taskSnapshot = this.f30773u;
        f fVar = this.f30774v;
        try {
            String uri3 = uri2.toString();
            i.f(uri3, "tt.toString()");
            StorageMetadata metadata = taskSnapshot.getMetadata();
            i.d(metadata);
            String contentType = metadata.getContentType();
            if (contentType != null) {
                str = contentType.toLowerCase();
                i.f(str, "this as java.lang.String).toLowerCase()");
            } else {
                str = null;
            }
            StorageMetadata metadata2 = taskSnapshot.getMetadata();
            i.d(metadata2);
            String name = metadata2.getName();
            HashMap hashMap = new HashMap();
            hashMap.put("ContentType", str);
            i.d(name);
            hashMap.put("FileName", name);
            qk.c cVar = fVar.E;
            String str2 = this.f30775w;
            ChatUser chatUser = fVar.f30783x;
            ChatUser chatUser2 = fVar.f30784y;
            String d10 = fVar.C.d();
            i.d(d10);
            cVar.b(uri3, str2, hashMap, chatUser, chatUser2, d10);
            if (this.f30776x) {
                fVar.e(this.f30777y);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(fVar.f30785z, e10);
        }
        return hs.k.f19476a;
    }
}
