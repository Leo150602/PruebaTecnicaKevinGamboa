
import { createRoot } from 'react-dom/client'
import App from './App.jsx'
import { ProvedorTema } from './Context/contextTema.jsx'
import { BrowserRouter } from 'react-router-dom'

createRoot(document.getElementById('root')).render(
  <ProvedorTema>
    <BrowserRouter>
      <App />  
    </BrowserRouter>
  </ProvedorTema>,
)
