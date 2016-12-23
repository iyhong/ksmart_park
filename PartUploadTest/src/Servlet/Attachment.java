package Servlet;

public class Attachment
{
    private String name;

    private byte[] contents;	//ë°”ì´?„ˆë¦¬í??… ë°°ì—´

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public byte[] getContents()
    {
        return contents;
    }

    public void setContents(byte[] contents)
    {
        this.contents = contents;
    }
}
