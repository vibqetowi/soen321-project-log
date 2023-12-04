package org.apache.http.conn.util;

import java.net.IDN;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.util.Args;
/* loaded from: classes5.dex */
public final class PublicSuffixMatcher {
    private final Map<String, DomainType> exceptions;
    private final Map<String, DomainType> rules;

    public PublicSuffixMatcher(Collection<String> collection, Collection<String> collection2) {
        this(DomainType.UNKNOWN, collection, collection2);
    }

    public PublicSuffixMatcher(DomainType domainType, Collection<String> collection, Collection<String> collection2) {
        Args.notNull(domainType, "Domain type");
        Args.notNull(collection, "Domain suffix rules");
        this.rules = new ConcurrentHashMap(collection.size());
        for (String str : collection) {
            this.rules.put(str, domainType);
        }
        this.exceptions = new ConcurrentHashMap();
        if (collection2 != null) {
            for (String str2 : collection2) {
                this.exceptions.put(str2, domainType);
            }
        }
    }

    public PublicSuffixMatcher(Collection<PublicSuffixList> collection) {
        Args.notNull(collection, "Domain suffix lists");
        this.rules = new ConcurrentHashMap();
        this.exceptions = new ConcurrentHashMap();
        for (PublicSuffixList publicSuffixList : collection) {
            DomainType type = publicSuffixList.getType();
            for (String str : publicSuffixList.getRules()) {
                this.rules.put(str, type);
            }
            List<String> exceptions = publicSuffixList.getExceptions();
            if (exceptions != null) {
                for (String str2 : exceptions) {
                    this.exceptions.put(str2, type);
                }
            }
        }
    }

    private static DomainType findEntry(Map<String, DomainType> map, String str) {
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    private static boolean match(DomainType domainType, DomainType domainType2) {
        return domainType != null && (domainType2 == null || domainType.equals(domainType2));
    }

    public String getDomainRoot(String str) {
        return getDomainRoot(str, null);
    }

    public String getDomainRoot(String str, DomainType domainType) {
        if (str == null || str.startsWith(".")) {
            return null;
        }
        String normalize = DnsUtils.normalize(str);
        String str2 = null;
        while (normalize != null) {
            String unicode = IDN.toUnicode(normalize);
            if (match(findEntry(this.exceptions, unicode), domainType)) {
                return normalize;
            }
            DomainType findEntry = findEntry(this.rules, unicode);
            if (match(findEntry, domainType)) {
                return findEntry == DomainType.PRIVATE ? normalize : str2;
            }
            int indexOf = normalize.indexOf(46);
            String substring = indexOf != -1 ? normalize.substring(indexOf + 1) : null;
            if (substring != null) {
                DomainType findEntry2 = findEntry(this.rules, "*." + IDN.toUnicode(substring));
                if (match(findEntry2, domainType)) {
                    return findEntry2 == DomainType.PRIVATE ? normalize : str2;
                }
            }
            str2 = normalize;
            normalize = substring;
        }
        if (domainType == null || domainType == DomainType.UNKNOWN) {
            return str2;
        }
        return null;
    }

    public boolean matches(String str) {
        return matches(str, null);
    }

    public boolean matches(String str, DomainType domainType) {
        if (str == null) {
            return false;
        }
        if (str.startsWith(".")) {
            str = str.substring(1);
        }
        return getDomainRoot(str, domainType) == null;
    }
}
