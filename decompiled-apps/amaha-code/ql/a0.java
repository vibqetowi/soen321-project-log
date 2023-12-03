package ql;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.UploadTask;
import com.theinnerhour.b2b.utils.LogHelper;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Calendar;
import kotlinx.coroutines.o0;
import ql.t;
/* compiled from: NewDynamicActivityViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dynamicActivities.utils.NewDynamicActivityViewModel$uploadBitmapToFirebaseStorage$2$1", f = "NewDynamicActivityViewModel.kt", l = {812}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class a0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f29658u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ t f29659v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ hs.f<String, Bitmap> f29660w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ int f29661x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ ls.d<hs.f<String, String>> f29662y;

    /* compiled from: NewDynamicActivityViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dynamicActivities.utils.NewDynamicActivityViewModel$uploadBitmapToFirebaseStorage$2$1$1", f = "NewDynamicActivityViewModel.kt", l = {949}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {
        public final /* synthetic */ int A;
        public final /* synthetic */ ls.d<hs.f<String, String>> B;

        /* renamed from: u  reason: collision with root package name */
        public StorageTask f29663u;

        /* renamed from: v  reason: collision with root package name */
        public kotlinx.coroutines.sync.c f29664v;

        /* renamed from: w  reason: collision with root package name */
        public t f29665w;

        /* renamed from: x  reason: collision with root package name */
        public int f29666x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ t f29667y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ hs.f<String, Bitmap> f29668z;

        /* compiled from: NewDynamicActivityViewModel.kt */
        /* renamed from: ql.a0$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0502a implements ya.e {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ t f29669a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ ls.d<hs.f<String, String>> f29670b;

            /* JADX WARN: Multi-variable type inference failed */
            public C0502a(t tVar, ls.d<? super hs.f<String, String>> dVar) {
                this.f29669a = tVar;
                this.f29670b = dVar;
            }

            @Override // ya.e
            public final void onFailure(Exception e10) {
                kotlin.jvm.internal.i.g(e10, "e");
                LogHelper.INSTANCE.e(this.f29669a.f29789y, e10);
                this.f29670b.resumeWith(null);
            }
        }

        /* compiled from: NewDynamicActivityViewModel.kt */
        /* loaded from: classes2.dex */
        public static final class b extends kotlin.jvm.internal.k implements ss.l<UploadTask.TaskSnapshot, hs.k> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ StorageReference f29671u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ ls.d<hs.f<String, String>> f29672v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ hs.f<String, Bitmap> f29673w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ t f29674x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(StorageReference storageReference, ls.d<? super hs.f<String, String>> dVar, hs.f<String, Bitmap> fVar, t tVar) {
                super(1);
                this.f29671u = storageReference;
                this.f29672v = dVar;
                this.f29673w = fVar;
                this.f29674x = tVar;
            }

            @Override // ss.l
            public final hs.k invoke(UploadTask.TaskSnapshot taskSnapshot) {
                ya.h<Uri> downloadUrl = this.f29671u.getDownloadUrl();
                ls.d<hs.f<String, String>> dVar = this.f29672v;
                hs.f<String, Bitmap> fVar = this.f29673w;
                t tVar = this.f29674x;
                downloadUrl.addOnSuccessListener(new t.g(new b0(dVar, fVar, tVar)));
                downloadUrl.addOnCanceledListener(new c0(dVar));
                downloadUrl.addOnFailureListener(new d0(tVar, dVar));
                return hs.k.f19476a;
            }
        }

        /* compiled from: NewDynamicActivityViewModel.kt */
        /* loaded from: classes2.dex */
        public static final class c implements ya.c {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ls.d<hs.f<String, String>> f29675a;

            /* JADX WARN: Multi-variable type inference failed */
            public c(ls.d<? super hs.f<String, String>> dVar) {
                this.f29675a = dVar;
            }

            @Override // ya.c
            public final void b() {
                this.f29675a.resumeWith(null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(t tVar, hs.f<String, Bitmap> fVar, int i6, ls.d<? super hs.f<String, String>> dVar, ls.d<? super a> dVar2) {
            super(2, dVar2);
            this.f29667y = tVar;
            this.f29668z = fVar;
            this.A = i6;
            this.B = dVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f29667y, this.f29668z, this.A, this.B, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            StorageTask<UploadTask.TaskSnapshot> storageTask;
            t tVar;
            kotlinx.coroutines.sync.c cVar;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f29666x;
            if (i6 != 0) {
                if (i6 == 1) {
                    tVar = this.f29665w;
                    cVar = this.f29664v;
                    storageTask = this.f29663u;
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                long timeInMillis = Calendar.getInstance().getTimeInMillis();
                t tVar2 = this.f29667y;
                File file = new File(tVar2.f2382x.getApplicationContext().getFilesDir(), "images");
                if (!file.exists()) {
                    file.mkdirs();
                }
                File createTempFile = File.createTempFile("activityImage" + timeInMillis, ".png", file);
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                hs.f<String, Bitmap> fVar = this.f29668z;
                fVar.f19465v.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                Uri b10 = FileProvider.b(tVar2.f2382x.getApplicationContext(), "com.theinnerhour.b2b.provider", createTempFile);
                StorageReference reference = FirebaseStorage.getInstance().getReference();
                StorageReference child = reference.child("users/" + FirebaseAuth.getInstance().a() + "/activityImages/activityImage_" + timeInMillis + '_' + this.A + ".png");
                kotlin.jvm.internal.i.f(child, "getInstance().reference.…timestamp}_${index}.png\")");
                UploadTask putFile = child.putFile(b10);
                ls.d<hs.f<String, String>> dVar = this.B;
                StorageTask<UploadTask.TaskSnapshot> addOnCanceledListener = putFile.addOnFailureListener((ya.e) new C0502a(tVar2, dVar)).addOnSuccessListener((ya.f<? super UploadTask.TaskSnapshot>) new t.g(new b(child, dVar, fVar, tVar2))).addOnCanceledListener((ya.c) new c(dVar));
                kotlin.jvm.internal.i.f(addOnCanceledListener, "private suspend fun uplo…ume(null)\n        }\n    }");
                this.f29663u = addOnCanceledListener;
                kotlinx.coroutines.sync.c cVar2 = tVar2.f29788l0;
                this.f29664v = cVar2;
                this.f29665w = tVar2;
                this.f29666x = 1;
                if (cVar2.b(this) == aVar) {
                    return aVar;
                }
                storageTask = addOnCanceledListener;
                tVar = tVar2;
                cVar = cVar2;
            }
            try {
                tVar.f29787k0.add(storageTask);
                hs.k kVar = hs.k.f19476a;
                cVar.a(null);
                return hs.k.f19476a;
            } catch (Throwable th2) {
                cVar.a(null);
                throw th2;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a0(t tVar, hs.f<String, Bitmap> fVar, int i6, ls.d<? super hs.f<String, String>> dVar, ls.d<? super a0> dVar2) {
        super(2, dVar2);
        this.f29659v = tVar;
        this.f29660w = fVar;
        this.f29661x = i6;
        this.f29662y = dVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new a0(this.f29659v, this.f29660w, this.f29661x, this.f29662y, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((a0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f29658u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.scheduling.b bVar = o0.f23642c;
            a aVar2 = new a(this.f29659v, this.f29660w, this.f29661x, this.f29662y, null);
            this.f29658u = 1;
            if (ta.v.S(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
