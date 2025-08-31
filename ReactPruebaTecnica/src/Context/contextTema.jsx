import { createContext, useContext, useState } from "react";

const ContextTema = createContext();

export function ProvedorTema({ children }) {
  const [modoOscuro, setModoOscuro] = useState(true);

  const AlternarTema = () => setModoOscuro(!modoOscuro);

  return (
    <ContextTema.Provider value={{ modoOscuro, AlternarTema }}>
      {children}
    </ContextTema.Provider>
  );
}

export function UsarTema() {
  return useContext(ContextTema);
}