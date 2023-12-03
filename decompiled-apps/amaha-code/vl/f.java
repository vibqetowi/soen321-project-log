package vl;

import com.theinnerhour.b2b.network.model.TelecommunicationsHomeworkResponseModel;
import kotlin.jvm.internal.i;
/* compiled from: ToolItemModel.kt */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final int f35270a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f35271b;

    /* renamed from: c  reason: collision with root package name */
    public final TelecommunicationsHomeworkResponseModel.HomeworkModel f35272c;

    public f(int i6, boolean z10, TelecommunicationsHomeworkResponseModel.HomeworkModel homeworkModel) {
        this.f35270a = i6;
        this.f35271b = z10;
        this.f35272c = homeworkModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f35270a == fVar.f35270a && this.f35271b == fVar.f35271b && i.b(this.f35272c, fVar.f35272c)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int i6 = this.f35270a * 31;
        boolean z10 = this.f35271b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (i6 + i10) * 31;
        TelecommunicationsHomeworkResponseModel.HomeworkModel homeworkModel = this.f35272c;
        if (homeworkModel == null) {
            hashCode = 0;
        } else {
            hashCode = homeworkModel.hashCode();
        }
        return i11 + hashCode;
    }

    public final String toString() {
        return "ToolItemModel(type=" + this.f35270a + ", isTherapy=" + this.f35271b + ", model=" + this.f35272c + ')';
    }

    public /* synthetic */ f(int i6, boolean z10, TelecommunicationsHomeworkResponseModel.HomeworkModel homeworkModel, int i10) {
        this(i6, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? null : homeworkModel);
    }
}
