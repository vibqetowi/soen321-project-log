package tm;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.w;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.UploadTask;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.components.journal.model.ImageResponse;
import com.theinnerhour.b2b.components.journal.model.JournalBasicModel;
import com.theinnerhour.b2b.components.journal.model.JournalModel;
import com.theinnerhour.b2b.components.journal.model.JournalQuestionModel;
import com.theinnerhour.b2b.components.journal.model.JournalThoughtModel;
import com.theinnerhour.b2b.components.journal.model.JournalUploadResponseModel;
import com.theinnerhour.b2b.utils.ConnectionStatusReceiver;
import com.theinnerhour.b2b.utils.LogHelper;
import hs.k;
import j$.time.Instant;
import j$.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
import ss.l;
import ss.p;
import ta.v;
/* compiled from: JournalParentViewModel.kt */
/* loaded from: classes2.dex */
public final class e extends androidx.lifecycle.b implements ConnectionStatusReceiver.ConnectivityListener {
    public final tm.a A;
    public JournalQuestionModel B;
    public JournalBasicModel C;
    public JournalThoughtModel D;
    public final w<String> E;
    public final w<JournalUploadResponseModel> F;
    public long G;
    public boolean H;
    public final w<tm.b> I;
    public JournalModel J;
    public final il.a K;
    public String L;
    public int M;
    public final w<ImageResponse> N;
    public StorageTask<UploadTask.TaskSnapshot> O;
    public boolean P;
    public boolean Q;
    public final ArrayList<StorageTask<UploadTask.TaskSnapshot>> R;

    /* renamed from: y  reason: collision with root package name */
    public final pm.a f33301y;

    /* renamed from: z  reason: collision with root package name */
    public final String f33302z;

    /* compiled from: JournalParentViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.journal.utils.JournalParentViewModel$networkDisconnected$1", f = "JournalParentViewModel.kt", l = {303}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements p<d0, ls.d<? super k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f33303u;

        /* compiled from: JournalParentViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.journal.utils.JournalParentViewModel$networkDisconnected$1$1", f = "JournalParentViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: tm.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0552a extends ns.i implements p<d0, ls.d<? super k>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ e f33305u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0552a(e eVar, ls.d<? super C0552a> dVar) {
                super(2, dVar);
                this.f33305u = eVar;
            }

            @Override // ns.a
            public final ls.d<k> create(Object obj, ls.d<?> dVar) {
                return new C0552a(this.f33305u, dVar);
            }

            @Override // ss.p
            public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
                return ((C0552a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                e eVar = this.f33305u;
                sp.b.d0(obj);
                try {
                    if (!eVar.R.isEmpty()) {
                        Iterator<T> it = eVar.R.iterator();
                        while (it.hasNext()) {
                            ((StorageTask) it.next()).cancel();
                        }
                        eVar.R.clear();
                        eVar.N.i(new ImageResponse.Failure("No Internet Connection"));
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(eVar.f33302z, e10);
                }
                return k.f19476a;
            }
        }

        public a(ls.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // ns.a
        public final ls.d<k> create(Object obj, ls.d<?> dVar) {
            return new a(dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f33303u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                kotlinx.coroutines.scheduling.c cVar = o0.f23640a;
                C0552a c0552a = new C0552a(e.this, null);
                this.f33303u = 1;
                if (v.S(cVar, c0552a, this) == aVar) {
                    return aVar;
                }
            }
            return k.f19476a;
        }
    }

    /* compiled from: JournalParentViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.journal.utils.JournalParentViewModel$uploadBitmapToFirebaseStorage$1", f = "JournalParentViewModel.kt", l = {205}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends ns.i implements p<d0, ls.d<? super k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f33306u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Uri f33308w;

        /* compiled from: JournalParentViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.journal.utils.JournalParentViewModel$uploadBitmapToFirebaseStorage$1$1", f = "JournalParentViewModel.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends ns.i implements p<d0, ls.d<? super k>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ e f33309u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ Uri f33310v;

            /* compiled from: JournalParentViewModel.kt */
            /* renamed from: tm.e$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0553a extends kotlin.jvm.internal.k implements l<UploadTask.TaskSnapshot, k> {

                /* renamed from: u  reason: collision with root package name */
                public final /* synthetic */ e f33311u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0553a(e eVar) {
                    super(1);
                    this.f33311u = eVar;
                }

                @Override // ss.l
                public final k invoke(UploadTask.TaskSnapshot taskSnapshot) {
                    UploadTask.TaskSnapshot taskSnapshot2 = taskSnapshot;
                    kotlin.jvm.internal.i.g(taskSnapshot2, "taskSnapshot");
                    double bytesTransferred = (taskSnapshot2.getBytesTransferred() * 100.0d) / taskSnapshot2.getTotalByteCount();
                    e eVar = this.f33311u;
                    boolean z10 = eVar.Q;
                    w<ImageResponse> wVar = eVar.N;
                    if (z10) {
                        wVar.i(new ImageResponse.Uploading(bytesTransferred));
                    } else {
                        wVar.i(new ImageResponse.Failure("No Internet Connection"));
                    }
                    return k.f19476a;
                }
            }

            /* compiled from: JournalParentViewModel.kt */
            /* renamed from: tm.e$b$a$b  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0554b extends kotlin.jvm.internal.k implements l<UploadTask.TaskSnapshot, k> {

                /* renamed from: u  reason: collision with root package name */
                public final /* synthetic */ StorageReference f33312u;

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ e f33313v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0554b(StorageReference storageReference, e eVar) {
                    super(1);
                    this.f33312u = storageReference;
                    this.f33313v = eVar;
                }

                @Override // ss.l
                public final k invoke(UploadTask.TaskSnapshot taskSnapshot) {
                    StorageReference storageReference = this.f33312u;
                    ya.h<Uri> downloadUrl = storageReference.getDownloadUrl();
                    e eVar = this.f33313v;
                    downloadUrl.addOnSuccessListener(new rk.b(7, new j(storageReference, eVar)));
                    downloadUrl.addOnCanceledListener(new i(1, eVar));
                    downloadUrl.addOnFailureListener(new g(eVar, 1));
                    return k.f19476a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar, Uri uri, ls.d<? super a> dVar) {
                super(2, dVar);
                this.f33309u = eVar;
                this.f33310v = uri;
            }

            @Override // ns.a
            public final ls.d<k> create(Object obj, ls.d<?> dVar) {
                return new a(this.f33309u, this.f33310v, dVar);
            }

            @Override // ss.p
            public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
                return ((a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                sp.b.d0(obj);
                e eVar = this.f33309u;
                eVar.N.i(ImageResponse.UploadingStarted.INSTANCE);
                long timeInMillis = Calendar.getInstance().getTimeInMillis();
                StorageReference reference = FirebaseStorage.getInstance().getReference();
                StorageReference child = reference.child("users/" + FirebaseAuth.getInstance().a() + "/journalImages/journalImage_" + timeInMillis + ".png");
                kotlin.jvm.internal.i.f(child, "getInstance().reference.…lImage_${timestamp}.png\")");
                StorageTask<UploadTask.TaskSnapshot> addOnCanceledListener = child.putFile(this.f33310v).addOnFailureListener((ya.e) new g(eVar, 0)).addOnProgressListener((OnProgressListener<? super UploadTask.TaskSnapshot>) new h(0, new C0553a(eVar))).addOnSuccessListener((ya.f<? super UploadTask.TaskSnapshot>) new rk.b(6, new C0554b(child, eVar))).addOnCanceledListener((ya.c) new i(0, eVar));
                kotlin.jvm.internal.i.f(addOnCanceledListener, "fun uploadBitmapToFireba…e ?: \"\"))\n        }\n    }");
                eVar.O = addOnCanceledListener;
                StorageTask<UploadTask.TaskSnapshot> storageTask = eVar.O;
                if (storageTask != null) {
                    ArrayList<StorageTask<UploadTask.TaskSnapshot>> arrayList = eVar.R;
                    if (storageTask != null) {
                        arrayList.add(storageTask);
                    } else {
                        kotlin.jvm.internal.i.q("uploadTask");
                        throw null;
                    }
                }
                return k.f19476a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Uri uri, ls.d<? super b> dVar) {
            super(2, dVar);
            this.f33308w = uri;
        }

        @Override // ns.a
        public final ls.d<k> create(Object obj, ls.d<?> dVar) {
            return new b(this.f33308w, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
            return ((b) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f33306u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                kotlinx.coroutines.scheduling.b bVar = o0.f23642c;
                a aVar2 = new a(e.this, this.f33308w, null);
                this.f33306u = 1;
                if (v.S(bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            }
            return k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(pm.a journalFirebaseRepository, Application application) {
        super(application);
        MyApplication myApplication;
        kotlin.jvm.internal.i.g(journalFirebaseRepository, "journalFirebaseRepository");
        kotlin.jvm.internal.i.g(application, "application");
        this.f33301y = journalFirebaseRepository;
        this.f33302z = LogHelper.INSTANCE.makeLogTag("JournalParentViewModel");
        this.A = new tm.a();
        ZoneId.systemDefault().getRules().getOffset(Instant.now());
        this.E = new w<>();
        this.F = new w<>();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        this.G = calendar.getTimeInMillis();
        this.I = new w<>();
        this.K = new il.a();
        this.L = "";
        this.N = new w<>();
        if (!this.P) {
            Context applicationContext = this.f2382x.getApplicationContext();
            if (applicationContext instanceof MyApplication) {
                myApplication = (MyApplication) applicationContext;
            } else {
                myApplication = null;
            }
            if (myApplication != null) {
                myApplication.a(this);
            }
            this.P = true;
        }
        this.R = new ArrayList<>();
    }

    public final String e(long j10) {
        return this.K.b(j10);
    }

    public final String f(int i6) {
        if (is.k.Q1(Integer.valueOf(i6), new Integer[]{11, 12, 13})) {
            return "th";
        }
        int i10 = i6 % 10;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return "th";
                }
                return "rd";
            }
            return "nd";
        }
        return "st";
    }

    public final JournalThoughtModel g() {
        JournalThoughtModel journalThoughtModel = this.D;
        if (journalThoughtModel != null) {
            return journalThoughtModel;
        }
        kotlin.jvm.internal.i.q("thoughtData");
        throw null;
    }

    public final void h() {
        StorageTask<UploadTask.TaskSnapshot> storageTask = this.O;
        if (storageTask != null) {
            if (storageTask != null) {
                if (!storageTask.isSuccessful()) {
                    StorageTask<UploadTask.TaskSnapshot> storageTask2 = this.O;
                    if (storageTask2 != null) {
                        storageTask2.cancel();
                        return;
                    } else {
                        kotlin.jvm.internal.i.q("uploadTask");
                        throw null;
                    }
                }
                return;
            }
            kotlin.jvm.internal.i.q("uploadTask");
            throw null;
        }
    }

    public final void i(Uri uri) {
        w<ImageResponse> wVar = this.N;
        try {
            if (!this.Q) {
                wVar.i(new ImageResponse.Failure("No Internet Connection"));
            } else {
                v.H(kc.f.H(this), null, 0, new b(uri, null), 3);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f33302z, e10);
            String localizedMessage = e10.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = "";
            }
            wVar.i(new ImageResponse.Failure(localizedMessage));
        }
    }

    @Override // com.theinnerhour.b2b.utils.ConnectionStatusReceiver.ConnectivityListener
    public final void networkConnected() {
        this.Q = true;
    }

    @Override // com.theinnerhour.b2b.utils.ConnectionStatusReceiver.ConnectivityListener
    public final void networkDisconnected() {
        this.Q = false;
        v.H(kc.f.H(this), null, 0, new a(null), 3);
    }
}
