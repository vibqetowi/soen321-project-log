package com.ifriend.common_utils.data;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Resource.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\f\r\u000eB\u001f\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00018\u0000X\u0096\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ifriend/common_utils/data/Resource;", ExifInterface.GPS_DIRECTION_TRUE, "", "data", "error", "", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getError", "()Ljava/lang/Throwable;", "Error", "Loading", "Success", "Lcom/ifriend/common_utils/data/Resource$Error;", "Lcom/ifriend/common_utils/data/Resource$Loading;", "Lcom/ifriend/common_utils/data/Resource$Success;", "common_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class Resource<T> {
    private final T data;
    private final Throwable error;

    public /* synthetic */ Resource(Object obj, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, th);
    }

    private Resource(T t, Throwable th) {
        this.data = t;
        this.error = th;
    }

    public /* synthetic */ Resource(Object obj, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? null : th, null);
    }

    public T getData() {
        return this.data;
    }

    public Throwable getError() {
        return this.error;
    }

    /* compiled from: Resource.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u0003\u001a\u00028\u0001X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/ifriend/common_utils/data/Resource$Success;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/ifriend/common_utils/data/Resource;", "data", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/ifriend/common_utils/data/Resource$Success;", "equals", "", "other", "", "hashCode", "", "toString", "", "common_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Success<T> extends Resource<T> {
        private final T data;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = success.data;
            }
            return success.copy(obj);
        }

        public final T component1() {
            return this.data;
        }

        public final Success<T> copy(T t) {
            return new Success<>(t);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(this.data, ((Success) obj).data);
        }

        public int hashCode() {
            T t = this.data;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        public String toString() {
            T t = this.data;
            return "Success(data=" + t + ")";
        }

        public Success(T t) {
            super(t, null, 2, null);
            this.data = t;
        }

        @Override // com.ifriend.common_utils.data.Resource
        public T getData() {
            return this.data;
        }
    }

    /* compiled from: Resource.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0001¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00018\u0001HÆ\u0003¢\u0006\u0002\u0010\u0006J \u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0001HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0018\u0010\u0003\u001a\u0004\u0018\u00018\u0001X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/ifriend/common_utils/data/Resource$Loading;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/ifriend/common_utils/data/Resource;", "data", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/ifriend/common_utils/data/Resource$Loading;", "equals", "", "other", "", "hashCode", "", "toString", "", "common_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Loading<T> extends Resource<T> {
        private final T data;

        public Loading() {
            this(null, 1, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loading copy$default(Loading loading, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = loading.data;
            }
            return loading.copy(obj);
        }

        public final T component1() {
            return this.data;
        }

        public final Loading<T> copy(T t) {
            return new Loading<>(t);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && Intrinsics.areEqual(this.data, ((Loading) obj).data);
        }

        public int hashCode() {
            T t = this.data;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        public String toString() {
            T t = this.data;
            return "Loading(data=" + t + ")";
        }

        public Loading(T t) {
            super(t, null, 2, null);
            this.data = t;
        }

        public /* synthetic */ Loading(Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : obj);
        }

        @Override // com.ifriend.common_utils.data.Resource
        public T getData() {
            return this.data;
        }
    }

    /* compiled from: Resource.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0001¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00018\u0001HÆ\u0003¢\u0006\u0002\u0010\bJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0001HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00018\u0001X\u0096\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/ifriend/common_utils/data/Resource$Error;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/ifriend/common_utils/data/Resource;", "error", "", "data", "(Ljava/lang/Throwable;Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getError", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "(Ljava/lang/Throwable;Ljava/lang/Object;)Lcom/ifriend/common_utils/data/Resource$Error;", "equals", "", "other", "", "hashCode", "", "toString", "", "common_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Error<T> extends Resource<T> {
        private final T data;
        private final Throwable error;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Error copy$default(Error error, Throwable th, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                th = error.error;
            }
            if ((i & 2) != 0) {
                obj = error.data;
            }
            return error.copy(th, obj);
        }

        public final Throwable component1() {
            return this.error;
        }

        public final T component2() {
            return this.data;
        }

        public final Error<T> copy(Throwable error, T t) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new Error<>(error, t);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Error) {
                Error error = (Error) obj;
                return Intrinsics.areEqual(this.error, error.error) && Intrinsics.areEqual(this.data, error.data);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.error.hashCode() * 31;
            T t = this.data;
            return hashCode + (t == null ? 0 : t.hashCode());
        }

        public String toString() {
            Throwable th = this.error;
            T t = this.data;
            return "Error(error=" + th + ", data=" + t + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable error, T t) {
            super(t, error, null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
            this.data = t;
        }

        public /* synthetic */ Error(Throwable th, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(th, (i & 2) != 0 ? null : obj);
        }

        @Override // com.ifriend.common_utils.data.Resource
        public T getData() {
            return this.data;
        }

        @Override // com.ifriend.common_utils.data.Resource
        public Throwable getError() {
            return this.error;
        }
    }
}
