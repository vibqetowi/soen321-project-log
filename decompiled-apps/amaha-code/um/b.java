package um;

import android.app.Application;
import androidx.lifecycle.w;
import com.theinnerhour.b2b.components.journal.model.JournalModel;
import com.theinnerhour.b2b.components.journal.model.JournalQuestionModel;
import hs.i;
import kotlin.jvm.internal.k;
/* compiled from: JournalEntryPointViewModel.kt */
/* loaded from: classes2.dex */
public final class b extends androidx.lifecycle.b {
    public final i A;

    /* renamed from: y  reason: collision with root package name */
    public final i f34236y;

    /* renamed from: z  reason: collision with root package name */
    public JournalQuestionModel f34237z;

    /* compiled from: JournalEntryPointViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements ss.a<tm.a> {

        /* renamed from: u  reason: collision with root package name */
        public static final a f34238u = new a();

        public a() {
            super(0);
        }

        @Override // ss.a
        public final tm.a invoke() {
            return new tm.a();
        }
    }

    /* compiled from: JournalEntryPointViewModel.kt */
    /* renamed from: um.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0574b extends k implements ss.a<w<JournalModel>> {

        /* renamed from: u  reason: collision with root package name */
        public static final C0574b f34239u = new C0574b();

        public C0574b() {
            super(0);
        }

        @Override // ss.a
        public final w<JournalModel> invoke() {
            return new w<>();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Application application) {
        super(application);
        kotlin.jvm.internal.i.g(application, "application");
        this.f34236y = sp.b.O(a.f34238u);
        this.A = sp.b.O(C0574b.f34239u);
    }
}
