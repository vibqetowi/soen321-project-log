package yu;
/* compiled from: ErrorTypeKind.kt */
/* loaded from: classes2.dex */
public enum h {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("Unresolved type for %s", true),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("Unresolved type parameter type", true),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("Unresolved class %s", true),
    f39084w("Unresolved java class %s", true),
    /* JADX INFO: Fake field, exist only in values array */
    EF7("Unresolved declaration %s", true),
    f39085x("Unresolved type for %s (arrayDimensions=%s)", true),
    /* JADX INFO: Fake field, exist only in values array */
    EF11("Unresolved type alias %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("Return type for %s cannot be resolved", false),
    f39086y("Return type for function cannot be resolved", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF10("Return type for property %s cannot be resolved", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("Return type for constructor %s cannot be resolved", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF6("Implicit return type for function %s cannot be resolved", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("Implicit return type for property %s cannot be resolved", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF6("Implicit return type for property accessor %s cannot be resolved", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("%s() return type", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF6("Recursive type", false),
    f39087z("Recursive type alias %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF6("Recursive annotation's type", false),
    A("Cyclic upper bounds", false),
    B("Cyclic supertypes", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("Cannot infer a lambda context receiver type", false),
    C("Cannot infer a lambda parameter type", false),
    D("Cannot infer a type variable %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF6("Resolution error type (%s)", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("Error expected type", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF6("Error type for data flow", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("Failed to reconstruct type %s", false),
    E("Unable to substitute type (%s)", false),
    F("Special DONT_CARE type", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF6("Stub type %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("Function placeholder type (arguments: %s)", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF6("Stubbed 'Result' type", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("Error type for a compiler exception while analyzing %s", false),
    G("Error java flexible type with id %s. (%s..%s)", false),
    H("Error raw type %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF6("Inconsistent type %s (parameters.size = %s, arguments.size = %s)", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("Illegal type range for dynamic type %s..%s", false),
    I("Unknown type parameter %s. Please try recompiling module containing \"%s\"", false),
    J("Couldn't deserialize type parameter %s in %s", false),
    K("Inconsistent suspend function type in metadata with constructor %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("Unexpected id of a flexible type %s. (%s..%s)", false),
    L("Unknown type", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("No type specified for %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF6("Loop range has no type", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("Loop parameter has no type", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF6("Missed a type for a value parameter %s", false),
    M("Missed a type argument for a type parameter %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF6("Error type for parse error argument %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("Error type for star projection directly passing as a call type argument", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF6("Dynamic type in a not allowed context", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("Not an annotation type %s in the annotation context", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF6("Unit type returned by inc or dec", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("Return not allowed", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF6("Unresolved 'Parcel' type", true),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("Kapt error type", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("Error type for synthetic element", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("Error type in ad hoc resolve for lighter classes", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("Error expression type", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("Error receiver type for %s", false),
    N("Error constant value %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("Empty callable reference", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("Unsupported callable reference type %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("Error delegation type for %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("Type is unavailable for declaration %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("Error type parameter", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("Error type projection", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("Error super type", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("Supertype of error type %s", false),
    O("Error property type", false),
    P("Error class", false),
    Q("Type for error type constructor (%s)", false),
    R("Intersection of error types %s", false),
    S("Cannot compute erased upper bound of a type parameter %s", false),
    T("Unsigned type %s not found", false),
    U("Not found the corresponding enum class for given enum entry %s.%s", false),
    V("Not found recorded type for %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("Descriptor not found for function %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("Cannot build class type, descriptor not found for builder %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("Cannot build type parameter type, descriptor not found for builder %s", false),
    W("Type for unmapped Java annotation target to Kotlin one", false),
    X("Unknown type for an array element of a java annotation argument", false),
    Y("No fqName for annotation %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF1104("No fqName for %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF1117("Type for generated error expression", false);
    

    /* renamed from: u  reason: collision with root package name */
    public final String f39088u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f39089v;

    h(String str, boolean z10) {
        this.f39088u = str;
        this.f39089v = z10;
    }
}
