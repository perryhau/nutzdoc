package org.nutz.doc;

public class Media extends Inline {

	private Refer src;

	public Refer src() {
		return src;
	}

	public String getSrc() {
		return src.toString();
	}

	public void src(String src) {
		this.src = Doc.refer(src);
	}

	public void src(Refer src) {
		if (null != this.getLine().getDoc().getFile())
			src.setBase(getLine().getDoc().getFile().getParent());
		this.src = src;
	}

	@Override
	public String getText() {
		return src.toString();
	}

	@Override
	public boolean isBlank() {
		return false;
	}

}
