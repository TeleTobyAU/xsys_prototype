method merge(a:array<int>, b:array<int>, c:array<int>)
modifies c
requires a.Length > 0
requires b.Length > 0
requires c.Length == a.Length + b.Length {

    var i:int := 0;
    var j:int := 0;
    var k:int := 0;

    while (k < c.Length)
        invariant 0 <= j <= b.Length
        invariant k <= i + j {
        if (i < a.Length && (j >= b.Length || a[i] <= b[j])) {
            c[k] := a[i];
            i := i+1;
        } else {
            c[k] := b[j];
            j := j + 1;
        }
    k := k + 1;
    }
}
