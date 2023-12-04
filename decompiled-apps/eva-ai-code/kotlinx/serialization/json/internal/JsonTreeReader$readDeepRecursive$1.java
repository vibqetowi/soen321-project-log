package kotlinx.serialization.json.internal;

import kotlin.DeepRecursiveScope;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JsonTreeReader.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@"}, d2 = {"Lkotlin/DeepRecursiveScope;", "", "Lkotlinx/serialization/json/JsonElement;", "it", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@DebugMetadata(c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", f = "JsonTreeReader.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class JsonTreeReader$readDeepRecursive$1 extends RestrictedSuspendLambda implements Function3<DeepRecursiveScope<Unit, JsonElement>, Unit, Continuation<? super JsonElement>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ JsonTreeReader this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeReader$readDeepRecursive$1(JsonTreeReader jsonTreeReader, Continuation<? super JsonTreeReader$readDeepRecursive$1> continuation) {
        super(3, continuation);
        this.this$0 = jsonTreeReader;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(DeepRecursiveScope<Unit, JsonElement> deepRecursiveScope, Unit unit, Continuation<? super JsonElement> continuation) {
        JsonTreeReader$readDeepRecursive$1 jsonTreeReader$readDeepRecursive$1 = new JsonTreeReader$readDeepRecursive$1(this.this$0, continuation);
        jsonTreeReader$readDeepRecursive$1.L$0 = deepRecursiveScope;
        return jsonTreeReader$readDeepRecursive$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AbstractJsonLexer abstractJsonLexer;
        AbstractJsonLexer abstractJsonLexer2;
        JsonElement readArray;
        JsonPrimitive readValue;
        JsonPrimitive readValue2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            DeepRecursiveScope deepRecursiveScope = (DeepRecursiveScope) this.L$0;
            abstractJsonLexer = this.this$0.lexer;
            byte peekNextToken = abstractJsonLexer.peekNextToken();
            if (peekNextToken == 1) {
                readValue2 = this.this$0.readValue(true);
                return readValue2;
            } else if (peekNextToken == 0) {
                readValue = this.this$0.readValue(false);
                return readValue;
            } else if (peekNextToken != 6) {
                if (peekNextToken == 8) {
                    readArray = this.this$0.readArray();
                    return readArray;
                }
                abstractJsonLexer2 = this.this$0.lexer;
                AbstractJsonLexer.fail$default(abstractJsonLexer2, "Can't begin reading element, unexpected token", 0, null, 6, null);
                throw new KotlinNothingValueException();
            } else {
                this.label = 1;
                obj = this.this$0.readObject(deepRecursiveScope, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return (JsonElement) obj;
    }
}
