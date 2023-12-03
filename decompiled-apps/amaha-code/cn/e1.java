package cn;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.b;
import com.theinnerhour.b2b.components.libraryExperiment.model.UserLibraryItemAccessModel;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import com.theinnerhour.b2b.model.LearningHubModel;
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import he.k;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
/* compiled from: LibraryViewModelRepository.kt */
/* loaded from: classes2.dex */
public final class e1 {

    /* renamed from: a  reason: collision with root package name */
    public final FirebaseFirestore f5467a = FirebaseFirestore.d();

    /* renamed from: b  reason: collision with root package name */
    public final String f5468b = LogHelper.INSTANCE.makeLogTag("LibraryViewModelRepository");

    /* compiled from: LibraryViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class a implements ValueEventListener {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ ls.d<HashMap<String, String>> f5469u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ HashMap<String, String> f5470v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ HashSet<String> f5471w;

        public a(ls.h hVar, HashMap hashMap, HashSet hashSet) {
            this.f5469u = hVar;
            this.f5470v = hashMap;
            this.f5471w = hashSet;
        }

        @Override // com.google.firebase.database.ValueEventListener
        public final void onCancelled(DatabaseError error) {
            kotlin.jvm.internal.i.g(error, "error");
            this.f5469u.resumeWith(null);
        }

        @Override // com.google.firebase.database.ValueEventListener
        public final void onDataChange(DataSnapshot snapshot) {
            String str;
            kotlin.jvm.internal.i.g(snapshot, "snapshot");
            boolean exists = snapshot.exists();
            ls.d<HashMap<String, String>> dVar = this.f5469u;
            if (exists && snapshot.hasChildren()) {
                Iterable<DataSnapshot> children = snapshot.getChildren();
                kotlin.jvm.internal.i.f(children, "snapshot.children");
                Iterator<DataSnapshot> it = children.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    HashMap<String, String> hashMap = this.f5470v;
                    if (hasNext) {
                        UserLibraryItemAccessModel userLibraryItemAccessModel = (UserLibraryItemAccessModel) it.next().getValue(UserLibraryItemAccessModel.class);
                        if (userLibraryItemAccessModel != null) {
                            str = userLibraryItemAccessModel.getId();
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            if (is.u.Z1(this.f5471w, userLibraryItemAccessModel.getId())) {
                                String id2 = userLibraryItemAccessModel.getId();
                                kotlin.jvm.internal.i.d(id2);
                                hashMap.put(id2, userLibraryItemAccessModel.getLabel());
                            }
                        }
                    } else {
                        dVar.resumeWith(hashMap);
                        return;
                    }
                }
            } else {
                dVar.resumeWith(null);
            }
        }
    }

    /* compiled from: LibraryViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class b implements ValueEventListener {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ ls.d<hs.f<String, UserLibraryItemAccessModel>> f5472u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f5473v;

        public b(String str, ls.h hVar) {
            this.f5472u = hVar;
            this.f5473v = str;
        }

        @Override // com.google.firebase.database.ValueEventListener
        public final void onCancelled(DatabaseError error) {
            kotlin.jvm.internal.i.g(error, "error");
            this.f5472u.resumeWith(null);
        }

        @Override // com.google.firebase.database.ValueEventListener
        public final void onDataChange(DataSnapshot snapshot) {
            kotlin.jvm.internal.i.g(snapshot, "snapshot");
            boolean exists = snapshot.exists();
            UserLibraryItemAccessModel userLibraryItemAccessModel = null;
            ls.d<hs.f<String, UserLibraryItemAccessModel>> dVar = this.f5472u;
            if (exists && snapshot.hasChildren()) {
                Iterable<DataSnapshot> children = snapshot.getChildren();
                kotlin.jvm.internal.i.f(children, "snapshot.children");
                DataSnapshot dataSnapshot = (DataSnapshot) is.u.h2(children);
                if (dataSnapshot != null) {
                    userLibraryItemAccessModel = (UserLibraryItemAccessModel) dataSnapshot.getValue(UserLibraryItemAccessModel.class);
                }
                dVar.resumeWith(new hs.f(this.f5473v, userLibraryItemAccessModel));
                return;
            }
            dVar.resumeWith(null);
        }
    }

    /* compiled from: LibraryViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class c<TResult> implements ya.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ls.d<RecommendedActivityModel> f5474a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ e1 f5475b;

        public c(e1 e1Var, ls.h hVar) {
            this.f5474a = hVar;
            this.f5475b = e1Var;
        }

        @Override // ya.d
        public final void a(ya.h<fe.r> it) {
            RecommendedActivityModel recommendedActivityModel;
            fe.q qVar;
            ls.d<RecommendedActivityModel> dVar = this.f5474a;
            kotlin.jvm.internal.i.g(it, "it");
            try {
                if (it.isSuccessful()) {
                    fe.r result = it.getResult();
                    if (result != null && (qVar = (fe.q) is.u.h2(result)) != null) {
                        recommendedActivityModel = (RecommendedActivityModel) qVar.d(RecommendedActivityModel.class);
                    } else {
                        recommendedActivityModel = null;
                    }
                    dVar.resumeWith(recommendedActivityModel);
                }
            } catch (Throwable th2) {
                LogHelper.INSTANCE.e(this.f5475b.f5468b, "exception in fetch learning hub content", th2);
                dVar.resumeWith(null);
            }
        }
    }

    /* compiled from: LibraryViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class d implements ya.e {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ls.d<RecommendedActivityModel> f5477b;

        public d(ls.h hVar) {
            this.f5477b = hVar;
        }

        @Override // ya.e
        public final void onFailure(Exception it) {
            kotlin.jvm.internal.i.g(it, "it");
            LogHelper logHelper = LogHelper.INSTANCE;
            String str = e1.this.f5468b;
            logHelper.e(str, "on failure listener fetch learning hub content " + it);
            this.f5477b.resumeWith(null);
        }
    }

    /* compiled from: LibraryViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class e<TResult> implements ya.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ls.d<LearningHubModel> f5478a;

        public e(ls.h hVar) {
            this.f5478a = hVar;
        }

        @Override // ya.d
        public final void a(ya.h<fe.r> it) {
            LearningHubModel learningHubModel;
            ls.d<LearningHubModel> dVar = this.f5478a;
            kotlin.jvm.internal.i.g(it, "it");
            try {
                if (it.isSuccessful()) {
                    fe.r result = it.getResult();
                    kotlin.jvm.internal.i.f(result, "it.result");
                    fe.q qVar = (fe.q) is.u.h2(result);
                    if (qVar != null && (learningHubModel = (LearningHubModel) qVar.d(LearningHubModel.class)) != null) {
                        learningHubModel.setId(qVar.b());
                    } else {
                        learningHubModel = null;
                    }
                    dVar.resumeWith(learningHubModel);
                    return;
                }
                dVar.resumeWith(null);
            } catch (Exception unused) {
                dVar.resumeWith(null);
            }
        }
    }

    /* compiled from: LibraryViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class f implements ya.e {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ls.d<LearningHubModel> f5480b;

        public f(ls.h hVar) {
            this.f5480b = hVar;
        }

        @Override // ya.e
        public final void onFailure(Exception it) {
            kotlin.jvm.internal.i.g(it, "it");
            LogHelper.INSTANCE.e(e1.this.f5468b, it);
            this.f5480b.resumeWith(null);
        }
    }

    /* compiled from: LibraryViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class g<TResult> implements ya.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.j<hs.f<String, String>> f5481a;

        public g(kotlinx.coroutines.k kVar) {
            this.f5481a = kVar;
        }

        @Override // ya.d
        public final void a(ya.h<fe.r> task) {
            kotlin.jvm.internal.i.g(task, "task");
            boolean isSuccessful = task.isSuccessful();
            kotlinx.coroutines.j<hs.f<String, String>> jVar = this.f5481a;
            if (isSuccessful && !task.getResult().f15006v.f17520b.f23278u.isEmpty()) {
                fe.r result = task.getResult();
                kotlin.jvm.internal.i.f(result, "task.result");
                Iterator<fe.q> it = result.iterator();
                if (it.hasNext()) {
                    Object d10 = it.next().d(TemplateModel.class);
                    kotlin.jvm.internal.i.f(d10, "it.toObject(TemplateModel::class.java)");
                    TemplateModel templateModel = (TemplateModel) d10;
                    jVar.resumeWith(new hs.f(templateModel.getLabel(), templateModel.getActivityDescription()));
                    return;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            jVar.resumeWith(null);
        }
    }

    /* compiled from: LibraryViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class h implements ya.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.j<hs.f<String, String>> f5482a;

        public h(kotlinx.coroutines.k kVar) {
            this.f5482a = kVar;
        }

        @Override // ya.e
        public final void onFailure(Exception it) {
            kotlin.jvm.internal.i.g(it, "it");
            this.f5482a.resumeWith(null);
        }
    }

    /* compiled from: LibraryViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class i implements ya.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ss.l f5483a;

        public i(ss.l lVar) {
            this.f5483a = lVar;
        }

        @Override // ya.f
        public final /* synthetic */ void onSuccess(Object obj) {
            this.f5483a.invoke(obj);
        }
    }

    /* compiled from: LibraryViewModelRepository.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.LibraryViewModelRepository", f = "LibraryViewModelRepository.kt", l = {358}, m = "setOrUpdateActivityAccessDate")
    /* loaded from: classes2.dex */
    public static final class j extends ns.c {

        /* renamed from: u  reason: collision with root package name */
        public e1 f5484u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f5485v;

        /* renamed from: x  reason: collision with root package name */
        public int f5487x;

        public j(ls.d<? super j> dVar) {
            super(dVar);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            this.f5485v = obj;
            this.f5487x |= LinearLayoutManager.INVALID_OFFSET;
            return e1.this.k(null, null, null, 0L, false, null, null, false, this);
        }
    }

    /* compiled from: LibraryViewModelRepository.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.LibraryViewModelRepository$setOrUpdateActivityAccessDate$2", f = "LibraryViewModelRepository.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class k extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {
        public final /* synthetic */ String A;
        public final /* synthetic */ boolean B;

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ String f5488u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f5489v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f5490w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ long f5491x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ boolean f5492y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f5493z;

        /* compiled from: LibraryViewModelRepository.kt */
        /* loaded from: classes2.dex */
        public static final class a implements ValueEventListener {
            public final /* synthetic */ String A;
            public final /* synthetic */ String B;
            public final /* synthetic */ boolean C;

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ DatabaseReference f5494u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ String f5495v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ String f5496w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ String f5497x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ long f5498y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ boolean f5499z;

            public a(DatabaseReference databaseReference, String str, String str2, String str3, long j10, boolean z10, String str4, String str5, boolean z11) {
                this.f5494u = databaseReference;
                this.f5495v = str;
                this.f5496w = str2;
                this.f5497x = str3;
                this.f5498y = j10;
                this.f5499z = z10;
                this.A = str4;
                this.B = str5;
                this.C = z11;
            }

            @Override // com.google.firebase.database.ValueEventListener
            public final void onCancelled(DatabaseError error) {
                kotlin.jvm.internal.i.g(error, "error");
            }

            @Override // com.google.firebase.database.ValueEventListener
            public final void onDataChange(DataSnapshot snapshot) {
                UserLibraryItemAccessModel userLibraryItemAccessModel;
                DatabaseReference ref;
                Long startDate;
                kotlin.jvm.internal.i.g(snapshot, "snapshot");
                boolean exists = snapshot.exists();
                long j10 = this.f5498y;
                if (exists && snapshot.hasChildren()) {
                    Iterable<DataSnapshot> children = snapshot.getChildren();
                    kotlin.jvm.internal.i.f(children, "snapshot.children");
                    DataSnapshot dataSnapshot = (DataSnapshot) is.u.h2(children);
                    if (dataSnapshot != null && (userLibraryItemAccessModel = (UserLibraryItemAccessModel) dataSnapshot.getValue(UserLibraryItemAccessModel.class)) != null) {
                        userLibraryItemAccessModel.setItemType(this.f5496w);
                        String str = this.f5497x;
                        if (!gv.n.B0(str)) {
                            userLibraryItemAccessModel.setLabel(str);
                        }
                        userLibraryItemAccessModel.setLastAccessedDate(Long.valueOf(j10));
                        if (userLibraryItemAccessModel.getStartDate() == null || ((startDate = userLibraryItemAccessModel.getStartDate()) != null && startDate.longValue() == 0)) {
                            userLibraryItemAccessModel.setStartDate(Long.valueOf(j10));
                        }
                        if (this.f5499z) {
                            userLibraryItemAccessModel.setCompleted(true);
                        }
                        userLibraryItemAccessModel.setParentId(this.A);
                        userLibraryItemAccessModel.setParentType(this.B);
                        userLibraryItemAccessModel.setFree(this.C);
                        Iterable<DataSnapshot> children2 = snapshot.getChildren();
                        kotlin.jvm.internal.i.f(children2, "snapshot.children");
                        DataSnapshot dataSnapshot2 = (DataSnapshot) is.u.h2(children2);
                        if (dataSnapshot2 != null && (ref = dataSnapshot2.getRef()) != null) {
                            ref.setValue(userLibraryItemAccessModel);
                            return;
                        }
                        return;
                    }
                    return;
                }
                DatabaseReference databaseReference = this.f5494u;
                String key = databaseReference.push().getKey();
                if (key != null) {
                    databaseReference.child(key).setValue(new UserLibraryItemAccessModel(this.f5495v, this.f5496w, this.f5497x, Long.valueOf(j10), Long.valueOf(j10), false, this.f5499z, this.A, this.B, this.C, null, Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID, null));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, String str2, String str3, long j10, boolean z10, String str4, String str5, boolean z11, ls.d<? super k> dVar) {
            super(2, dVar);
            this.f5488u = str;
            this.f5489v = str2;
            this.f5490w = str3;
            this.f5491x = j10;
            this.f5492y = z10;
            this.f5493z = str4;
            this.A = str5;
            this.B = z11;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new k(this.f5488u, this.f5489v, this.f5490w, this.f5491x, this.f5492y, this.f5493z, this.A, this.B, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((k) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            String j02;
            sp.b.d0(obj);
            fd.f fVar = FirebaseAuth.getInstance().f;
            if (fVar != null && (j02 = fVar.j0()) != null) {
                DatabaseReference reference = FirebaseDatabase.getInstance().getReference("userLibraryProgress/".concat(j02));
                kotlin.jvm.internal.i.f(reference, "getInstance().getReferen…serLibraryProgress/$uid\")");
                reference.orderByChild("id").equalTo(this.f5488u).addListenerForSingleValueEvent(new a(reference, this.f5488u, this.f5489v, this.f5490w, this.f5491x, this.f5492y, this.f5493z, this.A, this.B));
                return hs.k.f19476a;
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: LibraryViewModelRepository.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.LibraryViewModelRepository", f = "LibraryViewModelRepository.kt", l = {479}, m = "setOrUpdateActivityCompletionStatus")
    /* loaded from: classes2.dex */
    public static final class l extends ns.c {

        /* renamed from: u  reason: collision with root package name */
        public e1 f5500u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f5501v;

        /* renamed from: x  reason: collision with root package name */
        public int f5503x;

        public l(ls.d<? super l> dVar) {
            super(dVar);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            this.f5501v = obj;
            this.f5503x |= LinearLayoutManager.INVALID_OFFSET;
            return e1.this.l(null, null, null, false, null, null, false, this);
        }
    }

    /* compiled from: LibraryViewModelRepository.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.LibraryViewModelRepository$setOrUpdateActivityCompletionStatus$2", f = "LibraryViewModelRepository.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class m extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {
        public final /* synthetic */ boolean A;

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ String f5504u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f5505v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f5506w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f5507x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f5508y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f5509z;

        /* compiled from: LibraryViewModelRepository.kt */
        /* loaded from: classes2.dex */
        public static final class a implements ValueEventListener {
            public final /* synthetic */ String A;
            public final /* synthetic */ boolean B;

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ DatabaseReference f5510u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ String f5511v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ String f5512w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ String f5513x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ boolean f5514y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ String f5515z;

            public a(DatabaseReference databaseReference, String str, String str2, String str3, boolean z10, String str4, String str5, boolean z11) {
                this.f5510u = databaseReference;
                this.f5511v = str;
                this.f5512w = str2;
                this.f5513x = str3;
                this.f5514y = z10;
                this.f5515z = str4;
                this.A = str5;
                this.B = z11;
            }

            @Override // com.google.firebase.database.ValueEventListener
            public final void onCancelled(DatabaseError error) {
                kotlin.jvm.internal.i.g(error, "error");
            }

            @Override // com.google.firebase.database.ValueEventListener
            public final void onDataChange(DataSnapshot snapshot) {
                UserLibraryItemAccessModel userLibraryItemAccessModel;
                DatabaseReference ref;
                kotlin.jvm.internal.i.g(snapshot, "snapshot");
                if (snapshot.exists() && snapshot.hasChildren()) {
                    Iterable<DataSnapshot> children = snapshot.getChildren();
                    kotlin.jvm.internal.i.f(children, "snapshot.children");
                    DataSnapshot dataSnapshot = (DataSnapshot) is.u.h2(children);
                    if (dataSnapshot != null && (userLibraryItemAccessModel = (UserLibraryItemAccessModel) dataSnapshot.getValue(UserLibraryItemAccessModel.class)) != null) {
                        userLibraryItemAccessModel.setItemType(this.f5512w);
                        userLibraryItemAccessModel.setLabel(this.f5513x);
                        userLibraryItemAccessModel.setCompleted(this.f5514y);
                        Iterable<DataSnapshot> children2 = snapshot.getChildren();
                        kotlin.jvm.internal.i.f(children2, "snapshot.children");
                        DataSnapshot dataSnapshot2 = (DataSnapshot) is.u.h2(children2);
                        if (dataSnapshot2 != null && (ref = dataSnapshot2.getRef()) != null) {
                            ref.setValue(userLibraryItemAccessModel);
                            return;
                        }
                        return;
                    }
                    return;
                }
                DatabaseReference databaseReference = this.f5510u;
                String key = databaseReference.push().getKey();
                if (key != null) {
                    long timeInMillis = Calendar.getInstance().getTimeInMillis();
                    databaseReference.child(key).setValue(new UserLibraryItemAccessModel(this.f5511v, this.f5512w, this.f5513x, Long.valueOf(timeInMillis), Long.valueOf(timeInMillis), false, this.f5514y, this.f5515z, this.A, this.B, null, Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID, null));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str, String str2, String str3, boolean z10, String str4, String str5, boolean z11, ls.d<? super m> dVar) {
            super(2, dVar);
            this.f5504u = str;
            this.f5505v = str2;
            this.f5506w = str3;
            this.f5507x = z10;
            this.f5508y = str4;
            this.f5509z = str5;
            this.A = z11;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new m(this.f5504u, this.f5505v, this.f5506w, this.f5507x, this.f5508y, this.f5509z, this.A, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((m) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            String j02;
            sp.b.d0(obj);
            fd.f fVar = FirebaseAuth.getInstance().f;
            if (fVar != null && (j02 = fVar.j0()) != null) {
                DatabaseReference reference = FirebaseDatabase.getInstance().getReference("userLibraryProgress/".concat(j02));
                kotlin.jvm.internal.i.f(reference, "getInstance().getReferen…serLibraryProgress/$uid\")");
                reference.orderByChild("id").equalTo(this.f5504u).addListenerForSingleValueEvent(new a(reference, this.f5504u, this.f5505v, this.f5506w, this.f5507x, this.f5508y, this.f5509z, this.A));
                return hs.k.f19476a;
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: LibraryViewModelRepository.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.LibraryViewModelRepository", f = "LibraryViewModelRepository.kt", l = {421}, m = "setOrUpdateActivityFavouriteStatus")
    /* loaded from: classes2.dex */
    public static final class n extends ns.c {

        /* renamed from: u  reason: collision with root package name */
        public e1 f5516u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f5517v;

        /* renamed from: x  reason: collision with root package name */
        public int f5519x;

        public n(ls.d<? super n> dVar) {
            super(dVar);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            this.f5517v = obj;
            this.f5519x |= LinearLayoutManager.INVALID_OFFSET;
            return e1.this.m(null, null, null, false, null, null, false, this);
        }
    }

    /* compiled from: LibraryViewModelRepository.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.LibraryViewModelRepository$setOrUpdateActivityFavouriteStatus$2", f = "LibraryViewModelRepository.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class o extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {
        public final /* synthetic */ boolean A;

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ String f5520u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f5521v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f5522w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f5523x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f5524y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f5525z;

        /* compiled from: LibraryViewModelRepository.kt */
        /* loaded from: classes2.dex */
        public static final class a implements ValueEventListener {
            public final /* synthetic */ String A;
            public final /* synthetic */ boolean B;

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ DatabaseReference f5526u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ String f5527v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ String f5528w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ String f5529x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ boolean f5530y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ String f5531z;

            public a(DatabaseReference databaseReference, String str, String str2, String str3, boolean z10, String str4, String str5, boolean z11) {
                this.f5526u = databaseReference;
                this.f5527v = str;
                this.f5528w = str2;
                this.f5529x = str3;
                this.f5530y = z10;
                this.f5531z = str4;
                this.A = str5;
                this.B = z11;
            }

            @Override // com.google.firebase.database.ValueEventListener
            public final void onCancelled(DatabaseError error) {
                kotlin.jvm.internal.i.g(error, "error");
            }

            @Override // com.google.firebase.database.ValueEventListener
            public final void onDataChange(DataSnapshot snapshot) {
                UserLibraryItemAccessModel userLibraryItemAccessModel;
                DatabaseReference ref;
                kotlin.jvm.internal.i.g(snapshot, "snapshot");
                if (snapshot.exists() && snapshot.hasChildren()) {
                    Iterable<DataSnapshot> children = snapshot.getChildren();
                    kotlin.jvm.internal.i.f(children, "snapshot.children");
                    DataSnapshot dataSnapshot = (DataSnapshot) is.u.h2(children);
                    if (dataSnapshot != null && (userLibraryItemAccessModel = (UserLibraryItemAccessModel) dataSnapshot.getValue(UserLibraryItemAccessModel.class)) != null) {
                        userLibraryItemAccessModel.setItemType(this.f5528w);
                        userLibraryItemAccessModel.setLabel(this.f5529x);
                        boolean isFavourite = userLibraryItemAccessModel.isFavourite();
                        boolean z10 = this.f5530y;
                        userLibraryItemAccessModel.setFavourite(z10);
                        if (z10 && !isFavourite) {
                            userLibraryItemAccessModel.setBookmarkedDate(Long.valueOf(Calendar.getInstance().getTimeInMillis()));
                        }
                        Iterable<DataSnapshot> children2 = snapshot.getChildren();
                        kotlin.jvm.internal.i.f(children2, "snapshot.children");
                        DataSnapshot dataSnapshot2 = (DataSnapshot) is.u.h2(children2);
                        if (dataSnapshot2 != null && (ref = dataSnapshot2.getRef()) != null) {
                            ref.setValue(userLibraryItemAccessModel);
                            return;
                        }
                        return;
                    }
                    return;
                }
                DatabaseReference databaseReference = this.f5526u;
                String key = databaseReference.push().getKey();
                if (key != null) {
                    databaseReference.child(key).setValue(new UserLibraryItemAccessModel(this.f5527v, this.f5528w, this.f5529x, 0L, 0L, this.f5530y, false, this.f5531z, this.A, this.B, Long.valueOf(Calendar.getInstance().getTimeInMillis())));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, String str2, String str3, boolean z10, String str4, String str5, boolean z11, ls.d<? super o> dVar) {
            super(2, dVar);
            this.f5520u = str;
            this.f5521v = str2;
            this.f5522w = str3;
            this.f5523x = z10;
            this.f5524y = str4;
            this.f5525z = str5;
            this.A = z11;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new o(this.f5520u, this.f5521v, this.f5522w, this.f5523x, this.f5524y, this.f5525z, this.A, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((o) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            String j02;
            sp.b.d0(obj);
            fd.f fVar = FirebaseAuth.getInstance().f;
            if (fVar != null && (j02 = fVar.j0()) != null) {
                DatabaseReference reference = FirebaseDatabase.getInstance().getReference("userLibraryProgress/".concat(j02));
                kotlin.jvm.internal.i.f(reference, "getInstance().getReferen…serLibraryProgress/$uid\")");
                reference.orderByChild("id").equalTo(this.f5520u).addListenerForSingleValueEvent(new a(reference, this.f5520u, this.f5521v, this.f5522w, this.f5523x, this.f5524y, this.f5525z, this.A));
                return hs.k.f19476a;
            }
            return hs.k.f19476a;
        }
    }

    public static b1 b(e1 e1Var, String str, String variant) {
        e1Var.getClass();
        kotlin.jvm.internal.i.g(variant, "variant");
        return new b1(new kotlinx.coroutines.flow.r(new k1(-1L, e1Var.f5467a.b("library_collection").m(str, "collectionType").m(Boolean.TRUE, "published").m("en", "language").l(variant, "config").n(1L, Constants.DAYMODEL_POSITION).c(Constants.DAYMODEL_POSITION), null)));
    }

    public static kotlinx.coroutines.flow.r j(kotlinx.coroutines.flow.x lastVisibleItemAccessDate) {
        String str;
        kotlin.jvm.internal.i.g(lastVisibleItemAccessDate, "lastVisibleItemAccessDate");
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        StringBuilder sb2 = new StringBuilder("userLibraryProgress/");
        fd.f fVar = FirebaseAuth.getInstance().f;
        if (fVar != null) {
            str = fVar.j0();
        } else {
            str = null;
        }
        sb2.append(str);
        DatabaseReference reference = firebaseDatabase.getReference(sb2.toString());
        kotlin.jvm.internal.i.f(reference, "getInstance()\n          …nce().currentUser?.uid}\")");
        return new kotlinx.coroutines.flow.r(new q1(lastVisibleItemAccessDate, reference, 25, null));
    }

    public final a1 a() {
        return new a1(new kotlinx.coroutines.flow.r(new k1(100L, this.f5467a.b("mini_courses").m(Boolean.TRUE, "published"), null)));
    }

    public final Object c(String str, HashSet<String> hashSet, ls.d<? super HashMap<String, String>> dVar) {
        ls.h hVar = new ls.h(ca.a.G0(dVar));
        try {
            HashMap hashMap = new HashMap();
            FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
            firebaseDatabase.getReference("userLibraryProgress/" + str).addListenerForSingleValueEvent(new a(hVar, hashMap, hashSet));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f5468b, e10);
        }
        return hVar.b();
    }

    public final Object d(String str, String str2, ls.d<? super hs.f<String, UserLibraryItemAccessModel>> dVar) {
        ls.h hVar = new ls.h(ca.a.G0(dVar));
        try {
            FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
            firebaseDatabase.getReference("userLibraryProgress/" + str).orderByChild("id").equalTo(str2).addListenerForSingleValueEvent(new b(str2, hVar));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f5468b, e10);
        }
        return hVar.b();
    }

    public final Object e(String str, ls.d<? super RecommendedActivityModel> dVar) {
        ls.h hVar = new ls.h(ca.a.G0(dVar));
        try {
            ya.v a10 = FirebaseFirestore.d().b("recommended_activity_data").m(str, "_id").a();
            a10.addOnCompleteListener(new c(this, hVar));
            a10.addOnFailureListener(new d(hVar));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f5468b, e10);
        }
        return hVar.b();
    }

    public final Object f(String str, ls.d<? super LearningHubModel> dVar) {
        ls.h hVar = new ls.h(ca.a.G0(dVar));
        try {
            ya.v a10 = FirebaseFirestore.d().b("content_posts_new").k(new b.a(fe.j.f14995c, k.a.EQUAL, str)).a();
            a10.addOnCompleteListener(new e(hVar));
            a10.addOnFailureListener(new f(hVar));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f5468b, e10);
        }
        return hVar.b();
    }

    public final kotlinx.coroutines.flow.d g(kotlinx.coroutines.flow.x lastVisibleItem, String programme, List list) {
        boolean z10;
        kotlin.jvm.internal.i.g(lastVisibleItem, "lastVisibleItem");
        kotlin.jvm.internal.i.g(programme, "programme");
        if (list != null && !list.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        FirebaseFirestore firebaseFirestore = this.f5467a;
        if (!z10) {
            com.google.firebase.firestore.d o10 = firebaseFirestore.b("content_posts_new").m(programme, "programme").o("post_type", list);
            Boolean bool = Boolean.TRUE;
            return new h1(new kotlinx.coroutines.flow.r(new p1(lastVisibleItem, o10.m(bool, "published").m(bool, "status").m("en", "language").p(30, "day").c("day"), 10L, null)));
        }
        com.google.firebase.firestore.d m10 = firebaseFirestore.b("content_posts_new").m(programme, "programme");
        Boolean bool2 = Boolean.TRUE;
        return new i1(new kotlinx.coroutines.flow.r(new p1(lastVisibleItem, m10.m(bool2, "published").m(bool2, "status").m("en", "language").p(30, "day").c("day"), 10L, null)));
    }

    public final j1 h(String programme) {
        kotlin.jvm.internal.i.g(programme, "programme");
        com.google.firebase.firestore.d m10 = this.f5467a.b("content_posts_new").m(programme, "programme");
        Boolean bool = Boolean.TRUE;
        return new j1(new kotlinx.coroutines.flow.r(new k1(6L, m10.m(bool, "published").m(bool, "status").m("en", "language").c("day"), null)));
    }

    public final Object i(String str, ls.d<? super hs.f<String, String>> dVar) {
        kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(dVar));
        kVar.u();
        ya.v a10 = this.f5467a.b("template_bank").m(str, "label").m("en", "language").a();
        a10.addOnCompleteListener(new g(kVar));
        a10.addOnFailureListener(new h(kVar));
        return kVar.s();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(String str, String str2, String str3, long j10, boolean z10, String str4, String str5, boolean z11, ls.d<? super hs.k> dVar) {
        j jVar;
        int i6;
        e1 e1Var;
        boolean z12;
        if (dVar instanceof j) {
            jVar = (j) dVar;
            int i10 = jVar.f5487x;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                jVar.f5487x = i10 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = jVar.f5485v;
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                i6 = jVar.f5487x;
                if (i6 == 0) {
                    if (i6 == 1) {
                        e1Var = jVar.f5484u;
                        try {
                            sp.b.d0(obj);
                        } catch (Exception e10) {
                            e = e10;
                            LogHelper.INSTANCE.e(e1Var.f5468b, e);
                            return hs.k.f19476a;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    try {
                        kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.o0.f23642c;
                        if (z11) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        k kVar = new k(str, str2, str3, j10, z10, str4, str5, z12, null);
                        jVar.f5484u = this;
                        jVar.f5487x = 1;
                        if (ta.v.S(bVar, kVar, jVar) == aVar) {
                            return aVar;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        e1Var = this;
                        LogHelper.INSTANCE.e(e1Var.f5468b, e);
                        return hs.k.f19476a;
                    }
                }
                return hs.k.f19476a;
            }
        }
        jVar = new j(dVar);
        Object obj2 = jVar.f5485v;
        ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
        i6 = jVar.f5487x;
        if (i6 == 0) {
        }
        return hs.k.f19476a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(String str, String str2, String str3, boolean z10, String str4, String str5, boolean z11, ls.d<? super hs.k> dVar) {
        l lVar;
        int i6;
        e1 e1Var;
        boolean z12;
        if (dVar instanceof l) {
            lVar = (l) dVar;
            int i10 = lVar.f5503x;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                lVar.f5503x = i10 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = lVar.f5501v;
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                i6 = lVar.f5503x;
                if (i6 == 0) {
                    if (i6 == 1) {
                        e1Var = lVar.f5500u;
                        try {
                            sp.b.d0(obj);
                        } catch (Exception e10) {
                            e = e10;
                            LogHelper.INSTANCE.e(e1Var.f5468b, e);
                            return hs.k.f19476a;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    try {
                        kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.o0.f23642c;
                        if (z11) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        m mVar = new m(str, str2, str3, z10, str4, str5, z12, null);
                        lVar.f5500u = this;
                        lVar.f5503x = 1;
                        if (ta.v.S(bVar, mVar, lVar) == aVar) {
                            return aVar;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        e1Var = this;
                        LogHelper.INSTANCE.e(e1Var.f5468b, e);
                        return hs.k.f19476a;
                    }
                }
                return hs.k.f19476a;
            }
        }
        lVar = new l(dVar);
        Object obj2 = lVar.f5501v;
        ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
        i6 = lVar.f5503x;
        if (i6 == 0) {
        }
        return hs.k.f19476a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(String str, String str2, String str3, boolean z10, String str4, String str5, boolean z11, ls.d<? super hs.k> dVar) {
        n nVar;
        int i6;
        e1 e1Var;
        boolean z12;
        if (dVar instanceof n) {
            nVar = (n) dVar;
            int i10 = nVar.f5519x;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                nVar.f5519x = i10 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = nVar.f5517v;
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                i6 = nVar.f5519x;
                if (i6 == 0) {
                    if (i6 == 1) {
                        e1Var = nVar.f5516u;
                        try {
                            sp.b.d0(obj);
                        } catch (Exception e10) {
                            e = e10;
                            LogHelper.INSTANCE.e(e1Var.f5468b, e);
                            return hs.k.f19476a;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    try {
                        kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.o0.f23642c;
                        if (z11) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        o oVar = new o(str, str2, str3, z10, str4, str5, z12, null);
                        nVar.f5516u = this;
                        nVar.f5519x = 1;
                        if (ta.v.S(bVar, oVar, nVar) == aVar) {
                            return aVar;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        e1Var = this;
                        LogHelper.INSTANCE.e(e1Var.f5468b, e);
                        return hs.k.f19476a;
                    }
                }
                return hs.k.f19476a;
            }
        }
        nVar = new n(dVar);
        Object obj2 = nVar.f5517v;
        ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
        i6 = nVar.f5519x;
        if (i6 == 0) {
        }
        return hs.k.f19476a;
    }
}
