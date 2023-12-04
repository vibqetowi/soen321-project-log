package com.google.firebase.sessions;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.installations.FirebaseInstallationsApi;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.tasks.TasksKt;
/* compiled from: SessionCoordinator.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/google/firebase/sessions/SessionCoordinator;", "", "firebaseInstallations", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "eventGDTLogger", "Lcom/google/firebase/sessions/EventGDTLoggerInterface;", "(Lcom/google/firebase/installations/FirebaseInstallationsApi;Lcom/google/firebase/sessions/EventGDTLoggerInterface;)V", "attemptLoggingSessionEvent", "", "sessionEvent", "Lcom/google/firebase/sessions/SessionEvent;", "(Lcom/google/firebase/sessions/SessionEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class SessionCoordinator {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "SessionCoordinator";
    private final EventGDTLoggerInterface eventGDTLogger;
    private final FirebaseInstallationsApi firebaseInstallations;

    public SessionCoordinator(FirebaseInstallationsApi firebaseInstallations, EventGDTLoggerInterface eventGDTLogger) {
        Intrinsics.checkNotNullParameter(firebaseInstallations, "firebaseInstallations");
        Intrinsics.checkNotNullParameter(eventGDTLogger, "eventGDTLogger");
        this.firebaseInstallations = firebaseInstallations;
        this.eventGDTLogger = eventGDTLogger;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(9:5|6|(1:(3:9|10|11)(2:25|26))(4:27|28|29|(1:31)(1:32))|12|13|14|15|16|17))|36|6|(0)(0)|12|13|14|15|16|17|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b6, code lost:
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b7, code lost:
        android.util.Log.e(com.google.firebase.sessions.SessionCoordinator.TAG, "Error logging Session Start event to DataTransport: ", r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object attemptLoggingSessionEvent(SessionEvent sessionEvent, Continuation<? super Unit> continuation) {
        SessionCoordinator$attemptLoggingSessionEvent$1 sessionCoordinator$attemptLoggingSessionEvent$1;
        int i;
        SessionEvent sessionEvent2;
        SessionInfo sessionInfo;
        Exception e;
        SessionCoordinator sessionCoordinator;
        SessionInfo sessionInfo2;
        String str;
        if (continuation instanceof SessionCoordinator$attemptLoggingSessionEvent$1) {
            sessionCoordinator$attemptLoggingSessionEvent$1 = (SessionCoordinator$attemptLoggingSessionEvent$1) continuation;
            if ((sessionCoordinator$attemptLoggingSessionEvent$1.label & Integer.MIN_VALUE) != 0) {
                sessionCoordinator$attemptLoggingSessionEvent$1.label -= Integer.MIN_VALUE;
                Object obj = sessionCoordinator$attemptLoggingSessionEvent$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sessionCoordinator$attemptLoggingSessionEvent$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    SessionInfo sessionData = sessionEvent.getSessionData();
                    try {
                        Task<String> id = this.firebaseInstallations.getId();
                        Intrinsics.checkNotNullExpressionValue(id, "firebaseInstallations.id");
                        sessionCoordinator$attemptLoggingSessionEvent$1.L$0 = this;
                        sessionCoordinator$attemptLoggingSessionEvent$1.L$1 = sessionEvent;
                        sessionCoordinator$attemptLoggingSessionEvent$1.L$2 = sessionData;
                        sessionCoordinator$attemptLoggingSessionEvent$1.L$3 = sessionData;
                        sessionCoordinator$attemptLoggingSessionEvent$1.label = 1;
                        Object await = TasksKt.await(id, sessionCoordinator$attemptLoggingSessionEvent$1);
                        if (await == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        sessionEvent2 = sessionEvent;
                        sessionInfo2 = sessionData;
                        sessionInfo = sessionInfo2;
                        obj = await;
                        sessionCoordinator = this;
                    } catch (Exception e2) {
                        sessionEvent2 = sessionEvent;
                        sessionInfo = sessionData;
                        e = e2;
                        sessionCoordinator = this;
                        Log.e(TAG, "Error getting Firebase Installation ID: " + e + ". Using an empty ID");
                        str = "";
                        sessionInfo2 = sessionInfo;
                        sessionInfo2.setFirebaseInstallationId(str);
                        sessionCoordinator.eventGDTLogger.log(sessionEvent2);
                        Log.i(TAG, "Successfully logged Session Start event: " + sessionEvent2.getSessionData().getSessionId());
                        return Unit.INSTANCE;
                    }
                } else if (i == 1) {
                    sessionInfo2 = (SessionInfo) sessionCoordinator$attemptLoggingSessionEvent$1.L$3;
                    sessionInfo = (SessionInfo) sessionCoordinator$attemptLoggingSessionEvent$1.L$2;
                    sessionEvent2 = (SessionEvent) sessionCoordinator$attemptLoggingSessionEvent$1.L$1;
                    sessionCoordinator = (SessionCoordinator) sessionCoordinator$attemptLoggingSessionEvent$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Exception e3) {
                        e = e3;
                        Log.e(TAG, "Error getting Firebase Installation ID: " + e + ". Using an empty ID");
                        str = "";
                        sessionInfo2 = sessionInfo;
                        sessionInfo2.setFirebaseInstallationId(str);
                        sessionCoordinator.eventGDTLogger.log(sessionEvent2);
                        Log.i(TAG, "Successfully logged Session Start event: " + sessionEvent2.getSessionData().getSessionId());
                        return Unit.INSTANCE;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Intrinsics.checkNotNullExpressionValue(obj, "{\n        firebaseInstallations.id.await()\n      }");
                str = (String) obj;
                sessionInfo2.setFirebaseInstallationId(str);
                sessionCoordinator.eventGDTLogger.log(sessionEvent2);
                Log.i(TAG, "Successfully logged Session Start event: " + sessionEvent2.getSessionData().getSessionId());
                return Unit.INSTANCE;
            }
        }
        sessionCoordinator$attemptLoggingSessionEvent$1 = new SessionCoordinator$attemptLoggingSessionEvent$1(this, continuation);
        Object obj2 = sessionCoordinator$attemptLoggingSessionEvent$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sessionCoordinator$attemptLoggingSessionEvent$1.label;
        if (i != 0) {
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "{\n        firebaseInstallations.id.await()\n      }");
        str = (String) obj2;
        sessionInfo2.setFirebaseInstallationId(str);
        sessionCoordinator.eventGDTLogger.log(sessionEvent2);
        Log.i(TAG, "Successfully logged Session Start event: " + sessionEvent2.getSessionData().getSessionId());
        return Unit.INSTANCE;
    }

    /* compiled from: SessionCoordinator.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/google/firebase/sessions/SessionCoordinator$Companion;", "", "()V", "TAG", "", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
