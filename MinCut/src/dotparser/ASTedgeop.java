/* Generated By:JJTree: Do not edit this line. ASTedgeop.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package dotparser;

public
class ASTedgeop extends SimpleNode {
  public ASTedgeop(int id) {
    super(id);
  }

  public ASTedgeop(DOTParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(DOTParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=5be33c1b5d3f8d663baa4610837c2a23 (do not edit this line) */
