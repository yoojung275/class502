// import { useState } from 'react';
import Average from './components/Average';
/*
const App = () => {
  const [visible, setVisible] = useState(true);
*/

const App = () => {
  return <Average />;
};

/*
return (
  <>
    {visible && <LifeCycle mode="even" />}
    <button type="button" onClick={() => setVisible(!visible)}>
      클릭
    </button>
  </>
);
};
*/

export default App;
