package sunlib.turtle.models;

/**
 * User: fxp
 * Date: 13-8-23
 * Time: PM4:29
 */
public class ManifestItem {
    public String url;
    public String ts;

    @Override
    public String toString() {
        return url + ":" + ts;
    }
}
