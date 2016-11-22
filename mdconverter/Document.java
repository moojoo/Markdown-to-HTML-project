package mdconverter;

import java.util.LinkedList;

import Node.Node;

public class Document {
	private String input_file;
	private String format;
	private String output_file;
	private String output_dir;
	private String style;
	
	private LinkedList<Node> nodes;
	
	public Document(Option options){
		this.setInputFile(options.get("i"));
		this.setOutputFile(options.get("o"));
		this.setFormat(options.get("f"));
		this.setStyle(options.get("s"));
		this.setOutputDir(options.get("d"));
		nodes = new LinkedList<Node>();
	}
	
	public void updateNode(Node node){
		this.nodes.add(node);
	}
	
	public LinkedList<Node> getNodes(){
		return this.nodes;
	}
	
	//getter
	public String getInputFile() {
		return input_file;
	}

	public String getFormat() {
		return format;
	}

	public String getOutput_file() {
		return output_file;
	}

	public String getOutputDir() {
		return output_dir;
	}

	public String getStyle() {
		return style;
	}
	
	//setter
	private void setFormat(String format) {
		this.format = format;
	}
	
	private void setOutputFile(String output_file) {
		this.output_file = output_file;
	}
	
	private void setOutputDir(String output_dir) {
		this.output_dir = output_dir;
	}

	private void setStyle(String style) {
		this.style = style;
	}
	
	private void setInputFile(String input_file) {
		this.input_file = input_file;
	}
}