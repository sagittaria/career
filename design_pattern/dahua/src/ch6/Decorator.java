package ch6;

public abstract class Decorator extends Component {
    protected Component component;
    
    public void setComponent(Component component) {
        this.component = component;
    }

    public void Operation(){
        if(null!=component){
            component.Operation();
        }
    }
}
