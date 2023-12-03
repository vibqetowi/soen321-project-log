package rk;

import android.net.Uri;
import androidx.lifecycle.l0;
import androidx.lifecycle.w;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.components.chat.model.ChatMessage;
import com.theinnerhour.b2b.components.chat.model.ChatProgress;
import com.theinnerhour.b2b.components.chat.model.ChatUser;
import com.theinnerhour.b2b.utils.LogHelper;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import kotlin.jvm.internal.i;
/* compiled from: ChatViewModel.kt */
/* loaded from: classes2.dex */
public final class f extends l0 {
    public w<ArrayList<ChatMessage>> A;
    public w<ChatProgress> B;
    public final w<String> C;
    public final DatabaseReference D;
    public final qk.c E;
    public Query F;
    public ChildEventListener G;

    /* renamed from: x  reason: collision with root package name */
    public final ChatUser f30783x;

    /* renamed from: y  reason: collision with root package name */
    public final ChatUser f30784y;

    /* renamed from: z  reason: collision with root package name */
    public final String f30785z;

    public f(ChatUser currentUser, ChatUser friend) {
        i.g(currentUser, "currentUser");
        i.g(friend, "friend");
        this.f30783x = currentUser;
        this.f30784y = friend;
        this.f30785z = LogHelper.INSTANCE.makeLogTag(f.class);
        this.A = new w<>();
        this.B = new w<>();
        this.C = new w<>("");
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
        i.f(reference, "getInstance().reference");
        this.D = reference;
        this.E = new qk.c();
    }

    public final void e(String str) {
        String str2 = this.f30785z;
        try {
            if (new File(MyApplication.V.a().getFilesDir().toString() + '/' + str).delete()) {
                LogHelper.INSTANCE.i(str2, "file deleted");
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(str2, "exception in deleting file", e10);
        }
    }

    public final void f(String str) {
        try {
            DatabaseReference child = this.D.child("Status");
            fd.f fVar = FirebaseAuth.getInstance().f;
            i.d(fVar);
            child.child(fVar.j0()).setValue(str);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f30785z, "error in updating tvStatus", e10);
        }
    }

    public final void g(final String fileName, Uri uri, final boolean z10) {
        i.g(fileName, "fileName");
        StorageReference reference = FirebaseStorage.getInstance().getReference();
        StringBuilder sb2 = new StringBuilder("channel/");
        String d10 = this.C.d();
        i.d(d10);
        sb2.append(d10);
        sb2.append('/');
        sb2.append(Calendar.getInstance().getTimeInMillis());
        sb2.append('-');
        sb2.append(fileName);
        StorageReference child = reference.child(sb2.toString());
        i.f(child, "getInstance().reference.…timeInMillis}-$fileName\")");
        child.putFile(uri).addOnFailureListener(new ya.e() { // from class: rk.a
            @Override // ya.e
            public final void onFailure(Exception it) {
                f this$0 = this;
                i.g(this$0, "this$0");
                String fileName2 = fileName;
                i.g(fileName2, "$fileName");
                i.g(it, "it");
                if (z10) {
                    this$0.e(fileName2);
                }
            }
        }).addOnSuccessListener((ya.f<? super UploadTask.TaskSnapshot>) new b(0, new e(child, this, z10, fileName)));
    }
}
